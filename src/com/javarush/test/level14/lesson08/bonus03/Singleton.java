package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Alex on 05.05.2016.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {}
}
