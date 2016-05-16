package com.javarush.test.level17.lesson10.bonus02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

-c Alex м 21.06.1986
-c Alex23 м 21/06/1986 Alex22 м 12/07/1986
-c Arina ж 19-11-1990

-u 2 Alex-lexxusss м 21-06-1986

-i 2
*/

public class Solution {
    public static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public static DateFormat df_input = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static volatile List<Person> allPeople = new ArrayList<>();
    public static List<String> commands = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

        commands.add("-c");
        commands.add("-u");
        commands.add("-d");
        commands.add("-i");
    }

    public static void main(String[] args) throws Exception {
        /* for debug */
//        Scanner scanner = new Scanner(System.in);
//        String command;
//        for (int i = 0; scanner.hasNextLine() && !(command = scanner.nextLine()).equals(""); i++) {
//            String split[] = command.split(" ");
//            parseSplittedString(split);
//        }
        /* /for debug */

        parseSplittedString(args);
    }

    public static void parseSplittedString(String[] data) throws Exception {
        String command = data[0];
        if (commands.contains(command)) {
            synchronized (Solution.class) {
                try {
                    if (command.equals("-c")) {
                        createPerson(data);
                    } else if (command.equals("-u")) {
                        updatePerson(data);
                    } else if (command.equals("-d")) {
                        deletePerson(data);
                    } else if (command.equals("-i")) {
                        informPerson(data);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void informPerson(String[] data) {
        for (int i = 1; i < data.length; i++) {
            Person person = allPeople.get(Integer.parseInt(data[i]));

            String name = person.getName();
            String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
            String birthday = df_input.format(person.getBirthDay());

            System.out.println(name + " " + sex + " " + birthday);
        }
    }

    public static void deletePerson(String[] data) {
        for (int i = 1; i < data.length; i++) {
            Person person = allPeople.get(Integer.parseInt(data[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }
    }

    public static void updatePerson(String[] data) throws Exception {
        for (int i = 1; i < data.length; i += 4) {
            int id = Integer.parseInt(data[i]);
            Person person = allPeople.get(id);

            person.setSex(data[i + 2].equals("м") ? Sex.MALE : (data[i + 2].equals("ж") ? Sex.FEMALE : person.getSex()));
            person.setName(data[i + 1]);
            person.setBirthDay(df.parse(data[i + 3]));
        }
    }

    public static void createPerson(String[] data) throws Exception {
        for (int i = 1; i < data.length; i += 3) {
            Person person = null;
            if (data[i + 1].equals("м")) {
                person = Person.createMale(data[i], df.parse(data[i + 2]));
            } else if (data[i + 1].equals("ж")) {
                person = Person.createFemale(data[i], df.parse(data[i + 2]));
            }

            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
//            printPeople();
        }
    }

    public static void printPeople() {
        for (Person p: allPeople) {
            System.out.println(p.getName() + ", " + p.getSex() + ", " + df_input.format(p.getBirthDay()));
        }
    }
}
