package az.babayev.javarush.javasyntax.task.task6;

import java.lang.management.PlatformLoggingMXBean;

/*
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает результат вычитания из числа a числа b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)
 */
public class Task8_07 {
    public static class Calculator {
        public static int plus(int a, int b) {
            return a + b;
        }

        public static int minus(int a, int b) {
            return a - b;

        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double division(int a, int b) {
            return (double) a / b;
        }

        public static double percent(int a, int b) {
            return (double) a * b / 100;
        }

    }

    public static void main(String[] args) {
        System.out.println(Calculator.plus(12,2));
        System.out.println(Calculator.minus(12,2));
        System.out.println(Calculator.multiply(12,2));
        System.out.println(Calculator.division(12,2));
        System.out.println(Calculator.percent(12,2));

    }
}
