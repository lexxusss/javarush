package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] lines = new int[20];
        int[] ones = new int[lines.length / 2];
        int[] seconds = new int[lines.length / 2];

        for (int i = 0, j = 0; i < lines.length; i++) {
            if (i < lines.length / 2) {
                ones[i] = lines[i] = Integer.parseInt(reader.readLine());
            } else {
                seconds[j] = lines[i] = Integer.parseInt(reader.readLine());

                j++;
            }
        }

        for (int second: seconds) {
            System.out.println(second);
        }
    }
}
