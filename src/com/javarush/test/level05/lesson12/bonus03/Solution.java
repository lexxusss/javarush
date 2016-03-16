package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());

        for (; N > 1; N--) {
            maximum = max(maximum, Integer.parseInt(reader.readLine()));
        }

        System.out.println(maximum);
    }
}
