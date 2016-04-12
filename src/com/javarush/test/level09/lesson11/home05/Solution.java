package com.javarush.test.level09.lesson11.home05;

import java.util.Scanner;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String vowels = "";
        String notVowels = "";
        String space = " ";

        char[] line = scanner.nextLine().toCharArray();

        for (char ch: line) {
            if (isVowel(ch)) {
                vowels += ch + space;
            } else if (ch != ' ') {
                notVowels += ch + space;
            }
        }

        System.out.println(vowels);
        System.out.println(notVowels);
    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char d : vowels)
            if (c == d)
                return true;

        return false;
    }
}
