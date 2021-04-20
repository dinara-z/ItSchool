package com.itschool;

import java.util.Scanner;

//        Написать программу, которая в зависимости от первого входного параметра выводит
//        минимальное/максимальное значение из второго параметра, представляющего собой n
//        чисел без пробела (строка вида 123235094659843).
//        Входные данные: <[min/max]> <1,2, …, n>.
//        Выходные данные: в зависимости от первого параметра min/max вывести в терминал
//        минимальное/максимальное число.

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку из чисел: ");
        String stringOfNumbers = sc.nextLine();

        System.out.print("Введите min/max: ");
        String minMax = sc.nextLine();
        minMax = minMax.toLowerCase();

        char[]symbol = stringOfNumbers.toCharArray();
        int[] s = new int[symbol.length];
        for (int i = 0; i < symbol.length; i++)
            s[i] = Character.getNumericValue(symbol[i]);


        int min = s[0];
        int max = s[0];

        if (minMax.equals("min")) {
            for (int i = 1; i < symbol.length; i++){
                if (min >= s[i])
                    min = s[i];
            }
            System.out.println("Минимальное число: " + min);
        }
        else if (minMax.equals("max")){
            for (int i = 1; i < symbol.length; i++){
                if (max <= s[i])
                    max = s[i];
            }
            System.out.println("Максимальное значение: " + max);
        }
        else
            System.out.println("Неверное значение!");
    }
}
