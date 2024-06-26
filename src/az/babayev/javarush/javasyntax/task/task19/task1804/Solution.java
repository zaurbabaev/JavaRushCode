package az.babayev.javarush.javasyntax.task.task19.task1804;

import java.util.ArrayList;
import java.util.Collections;

/*
Перед тобой программа, которая сортирует список чисел по возрастанию.
Метод sortNumbers(ArrayList<Integer>) принимает список, элементы которого
необходимо отсортировать. Для сортировки используется метод
Collections.sort(ArrayList<Integer>, Comparator<Integer>),
параметрами которого являются список чисел и компаратор.

Твоя задача — переписать реализацию метода sortNumbers(ArrayList<Integer>),
чтобы вместо использования внутреннего анонимного класса Comparator<Integer>
использовалось лямбда-выражение.

Метод main() не принимает участие в тестировании.
 */
public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);
        sortNumbers(numbers);

//        Collections.sort(numbers);

        numbers.forEach(System.out::println);

    }

    public static void sortNumbers(ArrayList<Integer> numbers) {
//        numbers.sort((s1, s2) -> s1.compareTo(s2));
//        numbers.sort((s1,s2)->Integer.compare(s1,s2));
        numbers.sort(Integer::compare);

    }

}
