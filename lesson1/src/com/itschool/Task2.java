package com.itschool;

import java.util.Scanner;

//        На ввод подается n чисел не разделенных пробелом (строка вида 123235094659843).
//        Вычислить k-тый символ строки. Целочисленный параметр k передается пользователем.

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку из чисел: ");
        String stringOfNumbers= sc.nextLine();

        System.out.print("Введите k: ");
        int k = sc.nextInt();

        char[]symbol = stringOfNumbers.toCharArray();

        if (k <= symbol.length)
            System.out.println(symbol[k - 1]);
        else
            System.out.println("Неверное значение k!");

    }
}
