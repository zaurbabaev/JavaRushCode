package az.babayev.javarush.javasyntax.repetition;

import java.util.Scanner;

/*
Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа.
А программа сранивает два введенных числа и выводит на консоль результат сравнения
(два числа равны, первое число больше второго или первое число меньше второго).
 */
public class IfElseExample {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int a = console.nextInt();
            System.out.print("Введите второе число: ");
            int b = console.nextInt();
            if (a > b) {
                System.out.println("первое число больше второго");
            } else if (a < b) {
                System.out.println("первое число меньше второго");
            } else {
                System.out.println("два числа равны");
            }
        }
    }
}
