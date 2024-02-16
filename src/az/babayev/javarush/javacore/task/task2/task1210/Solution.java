package az.babayev.javarush.javacore.task.task2.task1210;

import java.util.stream.Stream;

/*
Напиши public static методы: int max(int, int), long max(long, long),
double max(double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(max(12, 54));
        System.out.println(max(102L, 4L));
        System.out.println(max(12.5, 54.34));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static long max(long a, long b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Stream.of(a, b).max(Double::compare).get();
    }
}
