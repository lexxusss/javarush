package com.javarush.test.level16.lesson13.bonus02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }

    private static void sleep()
    {
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        for (Thread thread: threads) {
//            thread.start();
//        }

        Thread thread2 = threads.get(1);
        thread2.start();
        sleep();
        thread2.interrupt();

        Thread thread4 = threads.get(3);
        Message message = (Message) thread4;
        thread4.start();
        sleep();
        message.showWarning();
        System.out.println(thread4.isAlive());
    }

    public static class MyThread5 extends Thread {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String line;

        @Override
        public void run() {
            while (this.scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (line.equals("N")) {
                    break;
                }

                sum += Integer.parseInt(line);
            }

            System.out.println(sum);
        }
    }

    public static class MyThread4 extends Thread implements Message {
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while(!current.interrupted())
            {

            }
        }

        public void showWarning() {
            this.interrupt();
            try
            {
                this.join();
            }
            catch(Exception e)
            {

            }
        }
    }

    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            while(true) {}
        }
    }

    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {}

                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
