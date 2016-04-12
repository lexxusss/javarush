package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String line;

        /*--- 1 ---*/
//        Scanner scanner = new Scanner(System.in);
//        line = scanner.nextLine();
//
//        try {
//            Date date = new Date(line);
//            System.out.println(dateFormat.format(date));
//        } catch (Exception e) {
//            System.out.println(line);
//        }
        /*--- /1 ---*/

        /*--- 2 ---*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        line = reader.readLine();

        try {
            Date date = new Date(line);
            System.out.println(dateFormat.format(date).toUpperCase());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        /*--- /2 ---*/
    }
}
