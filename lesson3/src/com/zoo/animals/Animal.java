package com.zoo.animals;

import com.zoo.exception.ECannotMove;
import com.zoo.exception.ECannotSay;

public abstract class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void whereAreYou() {
        System.out.println("В зоопарке");
    }

    public abstract void say() throws ECannotSay;

    public void sayIfYouCan() {
        try {
            System.out.print(this.getName() + " умеет говорить: ");
            say();
        }
        catch (ECannotSay e) {
            System.out.println("Exception - " + e.getMessage());
        }
    }

    public abstract boolean doYouLikeEat(String food);

    public void move() throws ECannotMove{
        if (Swimmable.class.isInstance(this)) {
            ((Swimmable)this).swim();
        } else
        if (Flying.class.isInstance(this)) {
            ((Flying)this).fly();
        } else
        if (Crawling.class.isInstance(this)) {
            ((Crawling)this).crawl();
        } else {
            throw new ECannotMove();
        }
    }

    public void move(boolean fast){
        try {
            move();
            if (fast)
                System.out.println(": быстро");
            else
                System.out.println(": медленно");
        }
        catch (ECannotMove e) {
            System.out.println(this.getName() + ": Exception - " + e.getMessage());
        }
    }
}
