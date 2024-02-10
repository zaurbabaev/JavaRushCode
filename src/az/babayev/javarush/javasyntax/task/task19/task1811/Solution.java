package az.babayev.javarush.javasyntax.task.task19.task1811;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
В этой задаче тебе нужно реализовать два метода так, чтобы:

Публичный статический метод getStreamFromArrayList(ArrayList<String>)
возвращал поток строк из списка строк, полученного в качестве аргумента.
Публичный статический метод getStreamFromArray(Integer[] array) возвращал
поток чисел из массива чисел, полученного в качестве аргумента.
Подсказка:
Чтобы получить поток данных у коллекции, нужно вызвать у нее метод stream().
Чтобы получить поток данных у массива, нужно вызвать у класса java.util.Arrays
статический метод stream(), в который передать массив.

Метод main() не принимает участие в тестировании.
 */
public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>(List.of(
                "Winter", "Spring", "Summer", "Autumn"
        ));

        Stream<String> stringStream = getStreamFromArrayList(strings);

        stringStream.forEach(System.out::println);

        var integers = new Integer[]{12, 34, 56, 78, 90};

        Stream<Integer> streamFromArray = getStreamFromArray(integers);

        streamFromArray.forEach(System.out::println);
    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        return list.stream();
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
        return Arrays.stream(array);
    }
}
