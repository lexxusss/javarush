package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> family = new ArrayList<>();

        family.add(new Human("GrandPa", true, 55));
        family.add(new Human("GrandMa", false, 51));
        family.add(new Human("GrandPa1", true, 54));
        family.add(new Human("GrandMa1", false, 50));
        family.add(new Human("Papa", true, 32, family.get(0), family.get(1)));
        family.add(new Human("Mama", false, 28, family.get(2), family.get(3)));
        family.add(new Human("Son", true, 8, family.get(4), family.get(5)));
        family.add(new Human("Dotty", false, 6, family.get(4), family.get(5)));
        family.add(new Human("Dotty1", false, 4, family.get(4), family.get(5)));

        for (Human s: family) {
            System.out.println(s.toString());
        }
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
