package com.zoo.animals;

// летучая мышь
public class Bat extends Animal implements Flying{

    public Bat(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.println("Пи-пи-пи!");
    }

    @Override
    public boolean doYouLikeEat(String food) {
        if (food.equals("Жуки")) {
            System.out.print("Да");
            return true;
        }
        else {
            System.out.print("Нет");
            return false;
        }
    }

    public void fly(){
        System.out.print(name + " летает");
    }

}
