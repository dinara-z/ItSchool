package com.zoo;

import com.zoo.animals.*;
import com.zoo.exception.ECapacityExceeded;
import com.zoo.exception.ENonExistentCage;

public class Application {

    public static void main(String[] args) {
        Animal[] animals = new Animal[70];
        int cnt = 7;
        for (int i = 0; i < 10; i++){
            animals[i*cnt] = new Bat("Летучая мышь " + Integer.toString(i + 1));
            animals[i*cnt + 1] = new Crow("Ворона " + Integer.toString(i + 1));
            animals[i*cnt + 2] = new Monkey("Обезьяна " + Integer.toString(i + 1));
            animals[i*cnt + 3] = new Seal("Морской котик " + Integer.toString(i + 1));
            animals[i*cnt + 4] = new Snake("Змея " + Integer.toString(i + 1));
            animals[i*cnt + 5] = new Turtle("Черепаха " + Integer.toString(i + 1));
            animals[i*cnt + 6] = new Walrus("Морж " + Integer.toString(i + 1));
        }


        for (int i = 0; i < cnt; i++) {
            animals[i].move(true);
            animals[i].move(false);
        }

        for (int i = 0; i < cnt; i++) {
            animals[i].sayIfYouCan();
        }

        String[] foods = new String[]{
                "Жуки", "Падаль", "Банан", "Рыба", "Грызуны", "Трава", "Моллюск"
        };

        for (int i = 0; i < cnt; i++) {
            var animal = animals[i];
            System.out.println(animal.getName() + ", ты любишь");
            for (String food : foods) {
                System.out.print("    " + food + " - ");
                animal.doYouLikeEat(food);
                System.out.println();
            }
        }

        Zoo zoo = new Zoo();
        var cages = zoo.getCages();

        for (Cage cage: cages) {
            showCageStatus(cage, animals, zoo);
        }

        Cage nonExistentCage = new Cage();
        nonExistentCage.setName("Домашние животные");
        showCageStatus(nonExistentCage, animals, zoo);

    }

    public static void showCageStatus(Cage cage, Animal[] animals, Zoo zoo){
        System.out.println("Добавляем животных в вольер: " + cage.getName());
        for (Animal animal: animals){
            try {
                zoo.addAnimalToCage(animal,cage);
                System.out.println("    " + animal.getName());
            }
            catch(ENonExistentCage e){
                System.out.println("    " + e.getMessage());
                break;
            }
            catch(ECapacityExceeded e){
                System.out.println("    " + e.getMessage());
                break;
            }
            catch(Exception e){
                System.out.println("    " + animal.getName() + ": " + e.getMessage());
            }
        }
    }
}
