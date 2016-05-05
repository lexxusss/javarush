package com.javarush.test.level14.lesson06.home01;

public class UkrainianHen extends Hen {
    public String country = Country.UKRAINE;

    public int getCountOfEggsPerMonth() {
        return 445;
    }

    public String getDescription() {
        String description = super.getDescription();
        description += " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

        return description;
    }
}
