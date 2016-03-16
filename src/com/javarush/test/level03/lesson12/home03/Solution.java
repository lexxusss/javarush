package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;
import java.util.concurrent.Callable;

public class Solution
{
    private String s, f;

    public Solution(String s, String f) {
        this.s = s;
        this.f = f;
    }

    public static void main(String[] args)   throws IOException {
        System.err.println("Hello");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        System.out.println("Я буду зарабатывать $" + n + " в час");
    }
}
