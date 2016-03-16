package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> minLines = new ArrayList<>();
        String line = reader.readLine();

        lines.add(line);
        minLines.add(lines.get(0));

        for (int i = 1; i < 5; i++) {
            lines.add(reader.readLine());

            line = lines.get(i);

            if (line.length() == minLines.get(minLines.size() - 1).length()) {
                minLines.add(line);
            } else if (line.length() < minLines.get(minLines.size() - 1).length()) {
                minLines.clear();
                minLines.add(line);
            }
        }

        for (String minL: minLines) {
            System.out.println(minL);
        }
    }
}
