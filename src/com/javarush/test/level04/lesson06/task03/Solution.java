package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = max(max(a, b), c);
        int min = min(min(a, b), c);
        int middle = c;

        if (a != max && a != min)
            middle = a;
        if (b != max && b != min)
            middle = b;

        System.out.println(max);
        System.out.println(middle);
        System.out.println(min);
    }
}
