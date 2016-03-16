package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public String name, colour;
    public int growth = 1;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int growth) {
        this.name = name;
        this.growth = growth;
    }

    public void initialize(String name, int growth, String colour) {
        this.name = name;
        this.growth = growth;
        this.colour = colour;
    }
}
