package az.babayev.javarush.javasyntax.task.task03;

import java.util.Scanner;

/*
Напиши программу, которая считывает с клавиатуры два вещественных числа (double)
 и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.
 */
public class EqualsDoubleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (Math.abs(b - a) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
