package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("child1", true, 10));
        children.add(new Human("child2", false, 6));
        children.add(new Human("child3", true, 1));

        Human pa = new Human("Pa", true, 35, new ArrayList<>(children));
        Human grandFa1 = new Human("grandFa1", true, 70, pa);
        Human grandMo1 = new Human("grandMo1", false, 65, pa);

        Human mo = new Human("Mo", false, 30, new ArrayList<>(children));
        Human grandFa2 = new Human("grandFa2", true, 72, mo);
        Human grandMo2 = new Human("grandMo2", false, 67, mo);

        for (Human member: Human.family)
            System.out.println(member.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public static ArrayList<Human> family = new ArrayList<>();

        /**
         * Constructor for adults
         *
         * @param name string
         * @param sex boolean
         * @param age int
         * @param child Human
         */
        public Human(String name, boolean sex, int age, Human child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
            this.children.add(child);

            Human.family.add(this);
        }

        /**
         * Constructor for adults
         *
         * @param name string
         * @param sex boolean
         * @param age int
         * @param children ArrayList<Human>
         */
        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(children);

            Human.family.add(this);
        }

        /**
         * Constructor for children
         *
         * @param name string
         * @param sex boolean
         * @param age int
         */
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            Human.family.add(this);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
