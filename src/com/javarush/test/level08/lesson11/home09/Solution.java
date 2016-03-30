package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так,
чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String date = reader.readLine();

        System.out.println(isDateOdd(date));
    }

    public static boolean isDateOdd(String date) {
        Calendar cal = Calendar.getInstance();

        cal.setTime(new Date(date));

        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

        return dayOfYear % 2 != 0;
    }
}
