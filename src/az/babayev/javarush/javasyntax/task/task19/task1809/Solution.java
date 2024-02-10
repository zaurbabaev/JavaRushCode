package az.babayev.javarush.javasyntax.task.task19.task1809;

import java.util.ArrayList;
import java.util.List;

/*
В классе Solution публичный метод print(ArrayList<Integer>) выводит в консоли
все элементы списка по порядку.
Сейчас метод реализован с использованием метода списка forEach(),
который принимает ссылку на метод. Необходимо переписать реализацию метода
print(ArrayList<Integer>), чтобы метод списка forEach() вместо ссылки на метод
принимал лямбда-выражения.

Метод main() не принимает участие в тестировании.
 */
public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>(List.of(
                12, 34, 54, 32, 1, 453, 1111
        ));
        print(numbers);
    }

    private static void print(ArrayList<Integer> numbers) {
        numbers.forEach(n -> System.out.println(n));

    }

}
