package az.babayev.javarush.javacore.task.task2.task1209;

import java.util.stream.Stream;

/*
Напиши public static методы: int min(int, int), long min(long, long),
double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(min2(12, -3));
        System.out.println(min2(12L, -10L));
        System.out.println(min2(12.5, -3.3));
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static long min(long a, long b) {
        return a > b ? b : a;
    }

    public static double min(double a, double b) {
        return a > b ? b : a;
    }


    public static int min2(int a, int b) {
        return Stream.of(a, b).min(Integer::compare).get();
    }

    public static long min2(long a, long b) {
        return Stream.of(a, b).min(Long::compare).get();
    }

    public static double min2(double a, double b) {
        return Stream.of(a, b).min(Double::compare).get();
    }
}
