package az.babayev.javarush.javasyntax.lection19.lambda.sort_example;

import java.util.ArrayList;
import java.util.List;

public class SortExample1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(
                1, 2, 442, 2, 42, -2, 3, 0, -43, 24, 8, 6, 56
        ));

        integers.sort((i1, i2) -> Integer.compare(i2, i1));
        integers.forEach(s -> System.out.print(s + " "));
    }
}
