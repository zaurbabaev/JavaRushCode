package az.babayev.javarush.javasyntax.task.task6;

import java.util.Scanner;

/*
Тебе нужно написать программу, которая:

Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] array = new int[n];
        if (n > 0) {
            if (n % 2 != 0) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = console.nextInt();
                }
            } else {
                for (int i = array.length - 1; i >= 0; i--) {
                    array[i] = console.nextInt();
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}

