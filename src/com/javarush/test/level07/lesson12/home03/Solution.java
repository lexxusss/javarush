package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];

        int  maximum = arr[0] = Integer.parseInt(reader.readLine());
        int  minimum = maximum;

        for (int i = 1; i < arr.length; i++) {
            int number = arr[i] = Integer.parseInt(reader.readLine());
            minimum = number < minimum ? number : minimum;
            maximum = number > maximum ? number : maximum;
        }

        System.out.print(maximum + " " + minimum);
    }
}
