package az.babayev.javarush.javasyntax.task.task04;

import java.util.Scanner;

/*
Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения
 (отбросить дробную часть, округлив вниз до целого числа).
В качестве значения pi используй 3.14.

Пример ввода:
5

Пример вывода:
78
 */
public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double pi = 3.14;
        if (console.hasNextInt()) {
            int radius = console.nextInt();
            int circleArea = (int) (pi * radius * radius);
            System.out.println(circleArea);
        }
    }
}
