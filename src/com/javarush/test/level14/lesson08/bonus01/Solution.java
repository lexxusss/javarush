package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception.toString());
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] a = new int[5];
            System.out.println(a[6]);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            int[] a = new int[5];
            System.out.println(a[6]);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            int[] as = new int[-1];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            Scanner sc = new Scanner(new FileInputStream("sss"));
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            Object o = null;
            o.hashCode();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String)x);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException("Too many PEZ!!!");
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchElementException();
        } catch (NoSuchElementException e) {
            exceptions.add(e);
        }

        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
    }
}
