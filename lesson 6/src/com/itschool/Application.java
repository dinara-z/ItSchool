package com.itschool;

public class Application {
    public static void main(String[] args) {
        do {
            WordGameBalda game = new WordGameBalda();
            game.runGame();
            System.out.println("Хотите сыграть еще? (да/нет)");
            String answer = game.scanner.nextLine();
            answer = answer.toLowerCase();

            if (!answer.equals("да"))
                break;
        }
        while (true);
    }
}
