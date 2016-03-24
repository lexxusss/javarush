package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, String> voc = createMap();

        System.out.println(getCountTheSameFirstName(voc, "Tsykk"));
        System.out.println(getCountTheSameLastName(voc, "Alex"));
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> vocabulary = new HashMap<>();

        vocabulary.put("Alex", "Tsyk");
        vocabulary.put("Alexxd", "Tsykk");
        vocabulary.put("Alexf", "Tsyk");
        vocabulary.put("Alexxa", "Tsykk");
        vocabulary.put("Alexg", "Tsyk");
        vocabulary.put("Alexxs", "Tsykk");
        vocabulary.put("Alexgddd", "Tsyk");
        vocabulary.put("Alexxxxc", "Tsykkk");
        vocabulary.put("Alexxxccx", "Tsykkk");
        vocabulary.put("Ale", "Tsy");

        return vocabulary;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        for (String firstName: map.values()) {
            if (firstName.equals(name))
                count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;

        for (String LName: map.keySet()) {
            if (LName.equals(lastName))
                count++;
        }

        return count;
    }
}
