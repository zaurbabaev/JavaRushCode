package az.babayev.javarush.javasyntax.task.task03;

import java.util.Scanner;

/*
Напиши программу, которая считывает с клавиатуры две строки и
выдает сообщение о том, одинаковые ли эти строки.
 */
public class StringEguals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        if (firstString.equals(secondString)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }


    }
}
