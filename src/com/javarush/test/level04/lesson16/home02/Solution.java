package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static int min, max;

    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static boolean isMiddle(int a) {
        return a != min && a != max;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()),
            b = Integer.parseInt(reader.readLine()),
            c = Integer.parseInt(reader.readLine());

        min = min(a, min(b, c));
        max = max(a, max(b, c));

        System.out.println(isMiddle(a) ? a : isMiddle(b) ? b : c);
    }
}
