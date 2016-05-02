package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        int id, wordCounter;
        String name;
        for (; true;) {
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                break;
            }

            name = reader.readLine();
            if (name.equals(""))
                break;

            if (!isNameInHash(map, name))
                map.put(name, id);

        }

        for (Map.Entry<String, Integer> pair: map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }

    public static boolean isNameInHash(HashMap<String, Integer> map, String name) {
        int counter = 0;

        if (map.size() > 0) {
            for (String n: map.keySet()) {
                if (name.equals(n)) {
                    counter++;
                }

                if (counter > 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
