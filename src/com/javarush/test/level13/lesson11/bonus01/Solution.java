package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10

e:\_INSTALL\PROG\JAVA\JavaRush\JavaRushHomeWork\testing.txt
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        Scanner in = new Scanner(new File(fileName));

        ArrayList<Integer> list = getIntsFromFile(in);

        Collections.sort(list);

        for (Integer i: list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        in.close();
        scanner.close();
    }

    public static ArrayList<Integer> getIntsFromFile(Scanner in) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }

        return list;
    }
}













