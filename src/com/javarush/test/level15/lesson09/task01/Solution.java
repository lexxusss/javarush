package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1, "3");
        labels.put(1.2, "4");
        labels.put(1.3, "5");
        labels.put(1.4, "6");
        labels.put(1.5, "7");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}