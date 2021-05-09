package com.itschool;

import java.util.Scanner;


//        Написать программу, считывающую передаваемые через командную строку
//        параметры и выполняющую арифметическое действие в зависимости от считанного
//        арифметического знака.
//        Входные данные: <int число1> <знак [+, -, *, /]> <int число 2>.
//        Выходные данные: результат арифметической операции.

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значения: ");
        int firstNumber = sc.nextInt();
        char arithmeticSign = sc.next().charAt(0);
        int secondNumber = sc.nextInt();
        int result;

        if (arithmeticSign == '+') {
            result = firstNumber + secondNumber;
            System.out.println(result);
        }
        else if (arithmeticSign == '-') {
            result = firstNumber - secondNumber;
            System.out.println(result);
        }
        else if (arithmeticSign == '*') {
            result = firstNumber * secondNumber;
            System.out.println(result);
        }
        else if ((arithmeticSign == '/') && (secondNumber != 0)) {
            result = firstNumber / secondNumber;
            System.out.println(result);
        }
        else
            System.out.println("Неверное значение");
    }
}
