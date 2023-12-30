package az.babayev.javarush.javasyntax.task.task02;

import java.util.Scanner;

/*
Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.

Пример ввода:

51
101
201
Пример вывода:

117
 */
public class Scanner2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 3; i++) {
            int number = console.nextInt();
            result += number;
        }
        System.out.println(result / 3);
    }
}
