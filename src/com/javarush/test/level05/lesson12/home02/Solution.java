package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man(31, "Alex", "Poland");
        Man man2 = new Man(32, "Dron", "Ukraine");
        Woman woman1 = new Woman(25, "Arina", "Poland");
        Woman woman2 = new Woman(27, "Nata", "Ukraine");

        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }

    public static class Man {
        String name, address;
        int age = 30;

        public Man(int age) {
            this.age = age;
        }

        public Man(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Man(int age, String name, String address) {
            this.age = age;
            this.name = name;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name, address;
        int age = 30;

        public Woman(int age) {
            this.age = age;
        }

        public Woman(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Woman(int age, String name, String address) {
            this.age = age;
            this.name = name;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
