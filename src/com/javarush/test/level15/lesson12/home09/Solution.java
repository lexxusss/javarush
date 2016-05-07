package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url;

        if (
            scanner.hasNext() &&
            (url = scanner.nextLine()).contains("?") &&
            url.contains("&")
        ) {
            String query = url.split("\\?")[1];
            String[] parsed = query.split("&");

            String key, value;
            List<String> alert = new ArrayList<>();

            String pair;
            int length = parsed.length;
            int last = length - 1;

            for (int i = 0; i < parsed.length; i++) {
                pair = parsed[i];
                if (pair.contains("=")) {
                    String[] splitted = pair.split("=");

                    key = splitted[0];

                    try {
                        value = splitted[1];
                    } catch (Exception e) {
                        value = "";
                    }
                } else {
                    key = pair;
                    value = "";
                }

                System.out.print(i == last ? key : key + " ");

                if (key.equals("obj"))
                    alert.add(value);
            }

            System.out.println("");

            for (String s: alert)
                try {
                    alert(Double.valueOf(s));
                } catch (NumberFormatException e) {
                    alert(s);
                }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
