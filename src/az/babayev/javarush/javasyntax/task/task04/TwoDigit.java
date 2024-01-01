package az.babayev.javarush.javasyntax.task.task04;
/*
Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:

Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике.
Второе - количество людей в кабинете.
Вывести на экран результат деления первого числа на второе.
Результатом должно быть вещественное число.
Пример ввода:
3
2

Пример вывода:
1.5
 */

import java.util.Scanner;

public class TwoDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        if (console.hasNextDouble()) {
            double firstNumber = console.nextDouble();
            double secondNumber = console.nextInt();
            System.out.println(firstNumber / secondNumber);
        }

    }
}
