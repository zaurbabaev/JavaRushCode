package az.babayev.javarush.javasyntax.task.task19.task1806;

import java.util.ArrayList;
import java.util.List;

/*
В классе Solution публичный метод print(ArrayList<Integer>) выводит в консоли
все элементы списка по порядку.
Сейчас метод реализован с использованием оператора for. Необходимо переписать
реализацию метода print(ArrayList<Integer>), используя метод списка forEach(),
принимающий лямбда-выражение. Логику работы метода print(ArrayList<Integer>)
менять не нужно.

Метод main() не принимает участие в тестировании.
 */
public class Solution {
    public static void main(String[] args) {
        var integers = new ArrayList<>(List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 0
        ));
        print(integers);
    }

    private static void print(ArrayList<Integer> integers) {
        integers.forEach(s -> System.out.println(s));
    }
}
