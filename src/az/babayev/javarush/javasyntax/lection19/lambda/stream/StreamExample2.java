package az.babayev.javarush.javasyntax.lection19.lambda.stream;

import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(12, 1, 0, -4, 5, -6);
        integerStream.sorted((o1, o2) -> o2 - o1).filter(i -> i > 0).forEach(System.out::println);


    }
}
