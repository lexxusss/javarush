package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int weekDay = Integer.parseInt(reader.readLine());
        String[] weekDays = new String[7];
        weekDays[1] = "понедельник";
        weekDays[2] = "вторник";
        weekDays[3] = "среда";
        weekDays[4] = "четверг";
        weekDays[5] = "пятница";
        weekDays[6] = "суббота";
        weekDays[7] = "воскресенье";

        if (weekDay < 1 || weekDay > 7)
            System.out.println("такого дня недели не существует");
        else
            System.out.println(weekDays[weekDay]);
    }
}
