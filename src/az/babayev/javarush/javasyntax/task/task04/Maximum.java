package az.babayev.javarush.javasyntax.task.task04;

import java.util.Scanner;

/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ. Выведи на экран максимальное четное число из введенных.
 Если введено несколько таких чисел, необходимо вывести любое из них.
 */
public class Maximum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int number = console.nextInt();
            if (number % 2 == 0) {
                if (max < number) {
                    max = number;
                }
            }
        }
        System.out.println(max);
    }
}
