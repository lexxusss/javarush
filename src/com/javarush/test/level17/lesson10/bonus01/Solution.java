package com.javarush.test.level17.lesson10.bonus01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990

-c Alex м 21.06.1986
-c Alex23 м 21/06/1986
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
                        deletePerson(Integer.parseInt(data[1]));
                    } else if (command.equals("-i")) {
                        informPerson(Integer.parseInt(data[1]));
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void informPerson(int id) {
        Person person = allPeople.get(id);

        String name = person.getName();
        String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
        String birthday = df_input.format(person.getBirthDay());

        System.out.println(name + " " + sex + " " + birthday);
    }

    public static void deletePerson(int id) {
        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDay(null);
    }

    public static void updatePerson(String[] data) throws Exception {
        int id = Integer.parseInt(data[1]);
        Person person = allPeople.get(id);

        person.setSex(data[3].equals("м") ? Sex.MALE : (data[3].equals("ж") ? Sex.FEMALE : person.getSex()));
        person.setName(data[2]);
        person.setBirthDay(df.parse(data[4]));
    }

    public static void createPerson(String[] data) throws Exception {
        Person person = null;
        if (data[2].equals("м")) {
            person = Person.createMale(data[1], df.parse(data[3]));
        } else if (data[2].equals("ж")) {
            person = Person.createFemale(data[1], df.parse(data[3]));
        }

        allPeople.add(person);
        System.out.println(allPeople.indexOf(person));
    }
}
