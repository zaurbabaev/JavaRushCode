package az.babayev.javarush.javasyntax.repetition;

import java.util.Scanner;

/*
Напишите консольную программу, в которой пользователь вводит с клавиатуры число.
Если число одновременно меньше 9 и больше 2, то программа выводит
"Число больше 2 и меньше 9". Иначе программа выводит сообщение "Неизвестное число".
 */
public class IfElseExample2 {
    public static void main(String[] args) {
        int a;
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            a = console.nextInt();
        }
        if (a > 2 && a < 9) {
            System.out.println("Число больше 2 и меньше 9");
        } else {
            System.out.println("Неизвестное число");
        }

    }
}
