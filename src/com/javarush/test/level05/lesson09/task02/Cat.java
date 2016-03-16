package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    public String name, colour, address;
    public int weight = 3, age = 2;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Cat(int weight, String colour, String address) {
        this.weight = weight;
        this.colour = colour;
        this.address = address;
    }
}
