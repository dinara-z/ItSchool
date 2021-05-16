package com.itschool;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int countNumbers = scanner.nextInt();
        System.out.print("Введите числа: ");
        ArrayList<MyInteger> numbers = new ArrayList<MyInteger>();

        for (int i = 0; i < countNumbers; i++){
            numbers.add(new MyInteger(scanner.nextInt()));
        }

        numbers.sort(new MyIntegerSortedByDecimalComparator());

        System.out.println("Отсортированный список по количеству различных десятичных разрядов: ");
        for (int i = 0; i < countNumbers; i++){
            System.out.println(Integer.toString(numbers.get(i).value));
        }

        numbers.sort(new MyIntegerSortedBySimpleDividerComparator());

        System.out.println("Отсортированный список по количеству простых делителей: ");
        for (int i = 0; i < countNumbers; i++){
            System.out.println(Integer.toString(numbers.get(i).value));
        }

    }
}
