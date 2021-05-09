package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.exception.ECapacityExceeded;
import com.zoo.exception.EUnacceptableAnimal;
import java.util.ArrayList;

public class Cage {

    private int capacity;
    private ArrayList<Class> acceptableAnimals;
    private ArrayList<Animal> animals;
    private String name;

    public Cage() {
        acceptableAnimals = new ArrayList<Class>();
        animals = new ArrayList<Animal>();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal) throws EUnacceptableAnimal, ECapacityExceeded {
        if (animals.size() >= capacity) {
            throw new ECapacityExceeded();
        }

        if (acceptableAnimals.contains(animal.getClass())) {
            animals.add(animal);
        }
        else {
            throw new EUnacceptableAnimal();
        }
    }

    public void addAcceptableClass(Class c){
        if (acceptableAnimals.indexOf(c) < 0) {
            acceptableAnimals.add(c);
        }
    }
}
