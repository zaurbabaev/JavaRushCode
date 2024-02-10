package az.babayev.javarush.javasyntax.lection19.lambda.sort_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionStringEx {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of(
                "Привет",
                "как",
                "дела?"
        ));
        strings.sort(new StringLengthComparator());

//        strings.sort(Comparator.comparingInt(String::length));

        strings.forEach(System.out::println);
    }
}
