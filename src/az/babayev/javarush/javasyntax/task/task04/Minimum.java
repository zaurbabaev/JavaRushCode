package az.babayev.javarush.javasyntax.task.task04;
/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ. Выведи на экран минимальное число из введенных.
 Если введено несколько таких чисел, необходимо вывести любое из них.
 */

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int minimun = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int i = console.nextInt();
            if (minimun > i) {
                minimun = i;
            }
        }
        System.out.println(minimun);
    }
}
