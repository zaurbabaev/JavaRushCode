package az.babayev.javarush.javasyntax.task.task19.task1807;

import java.util.ArrayList;
import java.util.List;

/*
В классе Solution публичный метод print(ArrayList<String>) выводит в консоли все
элементы списка по порядку.
Сейчас метод реализован с использованием метода списка forEach().
Необходимо переписать реализацию метода print(ArrayList<String>),
используя оператор for, не меняя логику работы метода.

Метод main() не принимает участие в тестировании.
 */
public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<>(List.of(
                "Hello", "Amigo", "JavaRush", "CodeGym"
        ));
        print(strings);


    }

    public static void print(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
