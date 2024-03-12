package az.babayev.javarush.javasyntax.task.task19.task1822;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) {
        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);
        getPositiveNumbers(numbers).forEach(System.out::println);

    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
        return numbers.filter(s -> s > 0).collect(toList());
    }
}
