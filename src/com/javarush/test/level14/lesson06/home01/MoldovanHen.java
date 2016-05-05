package com.javarush.test.level14.lesson06.home01;

public class MoldovanHen extends Hen {
    public String country = Country.MOLDOVA;

    public int getCountOfEggsPerMonth() {
        return 126;
    }

    public String getDescription() {
        String description = super.getDescription();
        description += " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

        return description;
    }
}
