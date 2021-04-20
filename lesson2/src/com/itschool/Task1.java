package com.itschool;

        import java.util.Scanner;

//      Написать программу, выполняющую рисования рамки вокруг текстовой строки.
//      Программа должна принимать на вход размеры рамки (длина/ширина) и саму строку.

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = sc.nextLine();

        System.out.print("Введите длину рамки: ");
        var lengthFrame = sc.nextInt();

        System.out.print("Введите ширину рамки: ");
        var widthFrame = sc.nextInt();

        boolean ok;

        if (((widthFrame - 2) >= line.length()) && ((lengthFrame - 2) >= 1))
            ok = true;
        else {
            ok = false;
            System.out.println("Ошибка!");
        }

        if (ok) {
            double lengthPoint = Math.ceil(((double) lengthFrame) / 2);

            PrintFullLine(widthFrame);

            for (int i = 1; i < lengthPoint - 1; i++)
                PrintEmptyLine(widthFrame);

            PrintWordLine(widthFrame, line);

            for (int i = (int)lengthPoint; i <= lengthFrame - 2; i++)
                PrintEmptyLine(widthFrame);

            PrintFullLine(widthFrame);

        }
    }

    public static void PrintFullLine(int lineLength) {
        for (int i = 1; i <= lineLength; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void PrintEmptyLine(int lineLength) {
        System.out.print("*");
        for (int i = 0; i < lineLength - 2; i++)
            System.out.print(" ");
        System.out.println("*");
    }

    public static void PrintWordLine(int columnLength, String line) {
        int widthPoint = (columnLength - line.length()) / 2;

        System.out.print("*");

        for (int i = 1; i < widthPoint; i++)
            System.out.print(" ");

        System.out.print(line);

        for (int i = line.length() + widthPoint; i <= columnLength - 2; i++)
            System.out.print(" ");
        System.out.println("*");

    }
}
