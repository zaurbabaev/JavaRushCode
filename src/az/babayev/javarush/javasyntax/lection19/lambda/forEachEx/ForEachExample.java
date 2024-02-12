package az.babayev.javarush.javasyntax.lection19.lambda.forEachEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of(
                "Hello", "How are you", "Welcome"
        ));

        strings.forEach(s -> System.out.println(s));

        System.out.println("-".repeat(30));

        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("-".repeat(30));

        strings.forEach(System.out::println);
    }
}

