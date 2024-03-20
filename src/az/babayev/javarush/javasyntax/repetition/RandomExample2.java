package az.babayev.javarush.javasyntax.repetition;

import java.util.Random;
import java.util.SplittableRandom;

public class RandomExample2 {
    public static void main(String[] args) {
        new Random().ints(10, 1, 7)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("-".repeat(20));

        new SplittableRandom().ints(10, 1, 7)
                .forEach(x -> System.out.print(x + " "));
    }
}
