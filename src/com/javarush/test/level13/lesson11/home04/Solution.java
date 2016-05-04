package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        OutputStream out = new FileOutputStream(fileName);
        String line;

        while (true) {
            line = scanner.next();
            if (line.equals("exit")) {
                writeLineInFile(line, out);
                break;
            }

            writeLineInFile(line, out);
        }
    }

    public static void writeLineInFile(String line, OutputStream out) throws IOException {
        char[] l = line.toCharArray();

        for (char c: l) {
            out.write(c);
        }

        out.write('\r');
        out.write('\n');
    }
}
