package az.babayev.javarush.javasyntax.task.task19.task1817_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Solution {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");
        printList(strings);

    }

    public static void printList(List<String> list) {
        String text = "This element is null";
        list.stream().map(x -> Optional.ofNullable(x).orElse(text))
                .forEach(System.out::println);

    }

}

