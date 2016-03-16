package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] array = new Integer[3];

        array[0] = Integer.parseInt(reader.readLine());
        array[1] = Integer.parseInt(reader.readLine());
        array[2] = Integer.parseInt(reader.readLine());

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > -1) counter += 1;
        }

        System.out.println(counter);
    }
}
