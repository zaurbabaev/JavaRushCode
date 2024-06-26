package az.babayev.javarush.javasyntax.task.task03;

import java.util.Scanner;

/*
Напишем программу, которая будет считывать с клавиатуры возраст.
Если возраст от 20 до 60 (включительно), то выводить ничего не нужно,
иначе - вывести фразу "можно не работать".
Сделать это можно (и нужно!) с помощью только одного оператора if без else.

Подсказка: используй логический оператор "||" (или).
 */
public class IfEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 20 || age > 60) {
            System.out.println("можно не работать");
        }
    }
}
