package az.babayev.javarush.javasyntax.lection19.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("Hello", "Java", "Amigo"));

        // variant 1
        String max = strings.stream().max((s1, s2) -> s1.length() - s2.length()).get();

        //variant 2
        Stream<String> stream = strings.stream();
        Optional<String> max1 = stream.max((s1, s2) -> s1.length() - s2.length());
        String str = max1.get();

    }
}
