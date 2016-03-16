package com.javarush.test.level04.lesson10.task01;

import java.io.*;

/* 10 чисел
Вывести на экран числа от 1 до 10 используя цикл while.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int number = 1;

        while (number < 11) {
            System.out.println(number);

            number += 1;
        }
    }
}