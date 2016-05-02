package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        public int age;
        public String name;
        public boolean sex;
        private String surname;
        private String address;
        private int phone;
        private String car;

        public Human(String surname, String address, String car) {
            this.surname = surname;
            this.address = address;
            this.car = car;
        }

        public Human(String name) {
            this.name = name;
        }
        public Human(int age) {
            this.age = age;
        }
        public Human(boolean sex) {
            this.sex = sex;
        }
        public Human(int age, String name) {
            this.name = name;
            this.age = age;
        }
        public Human(int age, String name, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }
        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }
        public Human(int age, boolean sex, String name) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
