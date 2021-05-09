package com.zoo.animals;

//обезьяна
public class Monkey extends Animal {

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("А-а-а!");
    }

    @Override
    public boolean doYouLikeEat(String food) {
        if (food.equals("Банан")) {
            System.out.print("Да");
            return true;
        }
        else {
            System.out.print("Нет");
            return false;
        }
    }
}
