package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int square  = 10;
        int outer = square;

        while (outer > 1) {
            int inner = square;

            while (inner > 0) {
                System.out.print("S");

                inner -= 1;
            }

            System.out.println();

            outer -= 1;
        }

        int inner = square;

        while (inner > 0) {
            System.out.print("S");

            inner -= 1;
        }
    }
}
