package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело
(весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader - а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> numbers = new ArrayList<>();

        /*--- variant 1 ---*/
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            while (true) {
//                numbers.add(Integer.parseInt(reader.readLine()));
//            }
//        } catch (Exception e) {
//            for (int number: numbers) {
//                System.out.println(number);
//            }
//        }
        /*--- /variant 1 ---*/

        /*--- variant 2 ---*/
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                numbers.add(scanner.nextInt());
            }
        } catch (Exception e) {
            for (int number: numbers) {
                System.out.println(number);
            }
        }
        /*--- /variant 2 ---*/
    }
}
