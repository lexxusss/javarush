package com.javarush.test.level09.lesson11.bonus01;

import java.io.*;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
---------------
files:
E:\_INSTALL\PROG\JAVA\JavaRush\JavaRushHomeWork\src\com\javarush\test\level09\lesson11\bonus01\source.txt
E:\_INSTALL\PROG\JAVA\JavaRush\JavaRushHomeWork\src\com\javarush\test\level09\lesson11\bonus01\desctination.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(sourceFileName);
            fileOutputStream = new FileOutputStream(destinationFileName);
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());

            return;
        }

        int count = 0;
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
