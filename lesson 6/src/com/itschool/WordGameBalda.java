package com.itschool;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class WordGameBalda {

    Player [] players = new Player[2];
    public Scanner scanner = new Scanner(System.in);
    HashSet<Character> letters;
    LinkedHashSet<String> wordsList;
    int playerNumber = 0;

    public void runGame(){
        var ok = initializeGame();
        if (ok)
            startGame();
        System.out.println("Игра окончена!");
    }

    private boolean initializeGame(){
        System.out.println("Добро пожаловать в игру Балда!");

        System.out.print("Введите имя первого игрока: ");
        String name = scanner.nextLine();
        if (name.isEmpty() || name.isBlank())
            return false;
        players[0] = new Player(name);

        System.out.print("Введите имя второго игрока: ");
        name = scanner.nextLine();
        if (name.isEmpty() || name.isBlank())
            return false;
        players[1] = new Player(name);

        if (players[0].name.equals(players[1].name)){
            players[0].name = players[0].name + " 1";
            players[1].name = players[1].name + " 2";
        }

        return true;
    }

    private void startGame(){

        var ok = defineMainWord();

        if (!ok)
            return;

        baseCycle();
        checkResults();

    }

    private boolean defineMainWord(){
        System.out.print("Введите главное слово: ");
        String mainWord = scanner.nextLine();
        mainWord = mainWord.toLowerCase();

        if (mainWord.isEmpty() || mainWord.isBlank()){
            System.out.println("Нет заданного слова!");
            return false;
        }

        letters = new HashSet<Character>();
        wordsList = new LinkedHashSet<String>();

        for (int i = 0; i < mainWord.length(); i++)
            letters.add(mainWord.charAt(i));

        return true;
    }

    private void baseCycle(){
        String newWord;
        do {
            System.out.print("Игрок " + players[playerNumber].name + " введите слово: ");
            newWord = scanner.nextLine();
            newWord = newWord.toLowerCase();
        }
        while (checkNextWord(newWord));
    }

    private boolean checkNextWord(String newWord){

        if (newWord.isEmpty() || newWord.isBlank())
            return false;

        if (!checkLetters(newWord)) {
            System.out.println("Слово не подходит!");
            return true;
        }

        if (!checkRepeat(newWord)) {
            System.out.println("Слово уже было!");
            return true;
        }

        players[playerNumber].addPoints(newWord.length());
        if (playerNumber == 0)
            playerNumber = 1;
        else
            playerNumber = 0;

        return true;
    }

    private boolean checkLetters(String newWord){
        for (int i = 0; i < newWord.length(); i++){
           if (!letters.contains(newWord.charAt(i)))
                return false;
        }
        return true;
    }

    public boolean checkRepeat (String newWord){
        if (wordsList.contains(newWord))
            return false;
        else {
            wordsList.add(newWord);
            return true;
        }
    }

    private void checkResults(){
        if (players[0].points > players[1].points)
            System.out.println("Победил игрок 1");
        else if (players[0].points < players[1].points)
            System.out.println("Победил игрок 2");
        else
            System.out.println("Ничья!");

        System.out.println("Игрок 1 набрал очков: " + players[0].points);
        System.out.println("Игрок 2 набрал очков: " + players[1].points);
    }
}


