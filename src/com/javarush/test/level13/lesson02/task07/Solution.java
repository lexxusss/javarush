package com.javarush.test.level13.lesson02.task07;

/* Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

import java.text.SimpleDateFormat;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject<Object> implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {
            return new StringObject<Object>();
        }
    }
}
