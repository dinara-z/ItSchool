package com.zoo.animals;

// морской котик
public class Seal extends Animal implements Swimmable {

    public Seal(String name){
        super(name);
    }

    @Override
    public void say() {
        System.out.println("О-о-о!");
    }

    @Override
    public boolean doYouLikeEat(String food) {
        if (food.equals("Рыба")) {
            System.out.print("Да");
            return true;
        }
        else {
            System.out.print("Нет");
            return false;
        }
    }

    public void swim(){
        System.out.print(name + " плавает");
    }
}
