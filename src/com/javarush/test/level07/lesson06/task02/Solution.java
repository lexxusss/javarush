package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> maxLines = new ArrayList<>();
        String line;
        System.out.println("!!");

        maxLines.add("");

        for (int i = 0; i < 5; i++) {
            lines.add(reader.readLine());

            line = lines.get(i);

            if (line.length() == maxLines.get(maxLines.size() - 1).length()) {
                maxLines.add(line);
            } else if (line.length() > maxLines.get(maxLines.size() - 1).length()) {
                maxLines.clear();
                maxLines.add(line);
            }
        }

        for (String maxL: maxLines) {
            System.out.println(maxL);
        }
    }
}
