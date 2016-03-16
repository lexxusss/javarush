package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа.
Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        int counterPositive = 0;
        int counterNegative = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > -1) counterPositive += 1;
            else counterNegative += 1;
        }

        System.out.println("количество отрицательных чисел: " + counterNegative);
        System.out.println("количество положительных чисел: " + counterPositive);
    }
}
