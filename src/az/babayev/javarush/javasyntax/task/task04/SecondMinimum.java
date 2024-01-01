package az.babayev.javarush.javasyntax.task.task04;
/*
Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать
не нужно, а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры.
Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.
Пример ввода:
8
4 // минимальное число
7
4 // минимальное число
5 // второе по величине число (второе минимальное)
9
5 // второе по величине число (второе минимальное)
exit
Пример вывода:
5
 */

import java.util.Scanner;

public class SecondMinimum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int current = console.nextInt();
            if (current < min) {
                secondMin=min;
                min = current;
            } else if (current <secondMin && current !=min) {
                secondMin = current;
            }
        }
        System.out.println(secondMin);
    }
}
