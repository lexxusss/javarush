package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        array = sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static int[] sort(int[] array) {
        Arrays.sort(array);
        int[] buffArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i > -1; i--, j++)
            buffArray[j] = array[i];

        return buffArray;
    }
}
