package com.zoo.animals;

//ворона
public class Crow extends Animal implements Flying {

    public Crow(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Кар-кар!");
    }

    @Override
    public boolean doYouLikeEat(String food) {
        if (food.equals("Падаль")) {
            System.out.print("Да");
            return true;
        } else {
            System.out.print("Нет");
            return false;
        }
    }

    public void fly() {
        System.out.print(name + " летает");
    }

}


