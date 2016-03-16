package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static int indexOfNumbers(int a, int b, int c) {
        if (a == b && a != c) return 3;
        if (a == c && b != c) return 2;
        if (c == b && a != c) return 1;

        return -1;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()),
            b = Integer.parseInt(reader.readLine()),
            c = Integer.parseInt(reader.readLine());

        int index = indexOfNumbers(a, b, c);

        if (index > 0) {
            System.out.println(index);
        }
    }
}
