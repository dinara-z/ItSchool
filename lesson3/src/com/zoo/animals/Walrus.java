package com.zoo.animals;

//морж
public class Walrus extends Animal implements Swimmable{

    public Walrus(String name){
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Р-р-р!");
    }
    @Override
    public boolean doYouLikeEat(String food) {
        if (food.equals("Моллюск")) {
            System.out.print("Да");
            return true;
        }
        else {
            System.out.print("Нет");
            return false;
        }
    }

    public void swim() {
        System.out.print(name + " плавает");
    }
}
