package az.babayev.javarush.javasyntax.lection17;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple", "orange"),
                Arrays.asList("banana", "grape")
        );
        List<String> flatList = nestedList.stream()
                .flatMap(Collection::stream)
                .toList();
        flatList.forEach(System.out::println);

        nestedList.forEach(System.out::println);


    }
}
