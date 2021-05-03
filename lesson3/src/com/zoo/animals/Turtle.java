package com.zoo.animals;

import com.zoo.exception.ECannotSay;

//черепаха
public class Turtle extends Animal implements Crawling{

    public Turtle(String name){
        super(name);
    }

    @Override
    public void say() throws ECannotSay {
        //System.out.println("...");
        throw new ECannotSay();
    }

    @Override
    public boolean doYouLikeEat(String food) {
        if (food.equals("Трава")) {
            System.out.print("Да");
            return true;
        }
        else {
            System.out.print("Нет");
            return false;
        }
    }

    public void crawl(){
        System.out.print(name + " ползает");
    }
}
