package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        /*--- first method ---*/
        HashMap<String, Integer> months = new HashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        System.out.println(month + " is " + months.get(month) + " month");
        /*--- /first method ---*/


        /*--- second method ---*/
//        Calendar cal = Calendar.getInstance();
//        String str = "1 " + month + " 2016";
//
//        cal.setTime(new Date(str));
//
//        System.out.println(month + " is " + (cal.get(Calendar.MONTH) + 1) + " month");
        /*--- /second method ---*/
    }

}