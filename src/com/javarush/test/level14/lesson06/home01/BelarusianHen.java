package com.javarush.test.level14.lesson06.home01;

public class BelarusianHen extends Hen {
    public String country = Country.BELARUS;

    public int getCountOfEggsPerMonth() {
        return 134;
    }

    public String getDescription() {
        String description = super.getDescription();
        description += " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

        return description;
    }
}
