package com.zoo;

import java.util.ArrayList;
import com.zoo.animals.*;
import com.zoo.exception.ECapacityExceeded;
import com.zoo.exception.ENonExistentCage;
import com.zoo.exception.EUnacceptableAnimal;

public class Zoo {
    private ArrayList<Cage> cages;

    public Zoo() {
        cages = new ArrayList<Cage>();
        Cage flyingCage = new Cage();
        flyingCage.setCapacity(10);
        flyingCage.setName("Летающие животные");
        flyingCage.addAcceptableClass(Bat.class);
        flyingCage.addAcceptableClass(Crow.class);
        cages.add(flyingCage);

        Cage crawlingCage = new Cage();
        crawlingCage.setCapacity(10);
        crawlingCage.setName("Рептилии");
        crawlingCage.addAcceptableClass(Snake.class);
        crawlingCage.addAcceptableClass(Turtle.class);
        cages.add(crawlingCage);

        Cage swimmableCage = new Cage();
        swimmableCage.setCapacity(3);
        swimmableCage.setName("Плавающие животные");
        swimmableCage.addAcceptableClass(Seal.class);
        swimmableCage.addAcceptableClass(Walrus.class);
        cages.add(swimmableCage);

        Cage monkeyCage = new Cage();
        monkeyCage.setCapacity(8);
        monkeyCage.setName("Обезьяны");
        monkeyCage.addAcceptableClass(Monkey.class);
        cages.add(monkeyCage);
    }

    public Cage getFlyingCage(){
        return cages.get(1);
    }

    public Cage getCrawlingCage(){
        return cages.get(2);
    }

    public Cage getSwimmableCage(){
        return cages.get(3);
    }

    public Cage getMonkeyCage(){
        return cages.get(4);
    }

    public ArrayList<Cage> getCages() {
        return cages;
    }

    public void addAnimalToCage(Animal animal, Cage cage) throws ENonExistentCage, ECapacityExceeded, EUnacceptableAnimal {
        if (!cages.contains(cage))
            throw new ENonExistentCage();

        cage.addAnimal(animal);
    }
}
