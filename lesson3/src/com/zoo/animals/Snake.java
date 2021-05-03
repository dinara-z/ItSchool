package com.zoo.animals;

//змея
public class Snake extends Animal implements Crawling{

    public Snake(String name){
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Ш-ш-ш!");
    }

    @Override
    public boolean doYouLikeEat(String food) {
        if (food.equals("Грызуны")) {
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
