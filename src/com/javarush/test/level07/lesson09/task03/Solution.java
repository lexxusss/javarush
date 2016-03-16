package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> words = new ArrayList<String>();

        words.add("мама");
        words.add("мыла");
        words.add("раму");

        int wordsSize = words.size();

        for (int i = 0; i < wordsSize; i++)
            words.add(2 * i + 1, "именно");

        for (String word: words)
            System.out.println(word);
    }
}
