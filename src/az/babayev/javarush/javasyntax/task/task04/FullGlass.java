package az.babayev.javarush.javasyntax.task.task04;

import java.util.Scanner;

/*
В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
 В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0),
 если пессимист (false) и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.

Пример ввода:
true

Пример вывода:
1

Подсказка:
Чтобы округлить вещественное число до целого вниз, используй метод Math.floor(), вверх - метод Math.ceil().
 */
public class FullGlass {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
        if (console.hasNextBoolean()) {
            boolean isFull = console.nextBoolean();
            int result = 0;
            if (isFull) {
                result = (int) Math.ceil(glass);
            } else {
                result = (int) Math.floor(glass);
            }
            System.out.println(result);
        }
        console.close();
    }
}
