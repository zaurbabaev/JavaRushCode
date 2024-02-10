package az.babayev.javarush.javasyntax.task.task19.task1808;

import java.util.ArrayList;
import java.util.List;

/*
В классе Solution публичный метод print(ArrayList<String>) выводит в консоли
все элементы списка по порядку.
Сейчас метод реализован с использованием метода списка forEach(),
который принимает лямбда-выражение. Необходимо переписать реализацию метода
print(ArrayList<String>), чтобы метод списка forEach()
вместо лямбда-выражения принимал ссылку на метод.

Метод main() не принимает участие в тестировании.
 */
public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>(List.of(
                "Hello", "Amigo", "JavaRush", "CodeGym"
        ));
        print(strings);
    }

    private static void print(ArrayList<String> strings) {
        strings.forEach(System.out::println);
    }
}
