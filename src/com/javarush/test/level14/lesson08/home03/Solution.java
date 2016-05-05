package com.javarush.test.level14.lesson08.home03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Person> map = new HashMap<>();
        map.put("user", new Person.User());
        map.put("looser", new Person.Looser());
        map.put("coder", new Person.Coder());
        map.put("proger", new Person.Proger());

        String key;
        while (scanner.hasNext() && map.containsKey(key = scanner.nextLine())) {
            doWork(map.get(key));
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.Coder) ((Person.Coder) person).coding();
        else if (person instanceof Person.Looser) ((Person.Looser) person).doNothing();
        else if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
        else if (person instanceof Person.User) ((Person.User) person).live();
    }
}
