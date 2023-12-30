package az.babayev.javarush.javasyntax.task.task03;

import java.util.Scanner;

/*
Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2

b) при вводе чисел 2 2 2 получим вывод 2 2 2
 */
public class ThreeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && a == c) {
            System.out.print(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.print(a + " " + b);
        } else if (a == c) {
            System.out.print(a + " " + c);
        } else if (b == c) {
            System.out.print(b + " "+c);
        }
    }
}
