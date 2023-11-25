package az.babayev.javarush.javasyntax.task.task4;

/*
Напиши метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10
из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11.
Если оба числа на равной длине к 10, то вывести на экран любое из них.

Подсказка:
используй метод public static int abs(int a),
который возвращает абсолютную величину числа.
 */
public class Task4_02 {
    public static void main(String[] args) {
displayClosestToTen(8,11);
displayClosestToTen(7,-8);
    }

    public static void displayClosestToTen(int a, int b) {
        System.out.println(abs(a - 10) <= abs(b - 10) ? a : b);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
