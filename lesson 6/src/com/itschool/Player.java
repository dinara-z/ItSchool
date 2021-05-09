package com.itschool;

public class Player {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    int points = 0;

    public void addPoints(int pointsCount){
        points += pointsCount;
    }

}
