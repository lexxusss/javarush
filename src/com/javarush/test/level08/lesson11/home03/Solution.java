package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> people = new HashMap<>();

        people.put("Surname-1", "Name-1");
        people.put("Surname-2", "Name-2");
        people.put("Surname-3", "Name-3");
        people.put("Surname-4", "Name-4");
        people.put("Surname-5", "Name-5");
        people.put("Surname-6", "Name-6");
        people.put("Surname-7", "Name-4");
        people.put("Surname-8", "Name-8");
        people.put("Surname-9", "Name-9");
        people.put("Surname-1", "Name-10");

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet())
            System.out.println(s.getKey() + " " + s.getValue());
    }
}
