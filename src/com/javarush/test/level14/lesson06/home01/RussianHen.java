package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen {
    public String country = Country.RUSSIA;

    public int getCountOfEggsPerMonth() {
        return 234;
    }

    public String getDescription() {
        String description = super.getDescription();
        description += " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

        return description;
    }
}
