package az.babayev.javarush.javasyntax.lection18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 12, 4, 5, 32, -7, 0, 342, 1);
        System.out.println(numbers);
        System.out.println("-".repeat(30));
        Collections.reverse(numbers);
        System.out.println(numbers);
        System.out.println("-".repeat(30));
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("-".repeat(30));
//        Collections.reverse(numbers);
        System.out.println(numbers);
        System.out.println("-".repeat(30));
        Collections.rotate(numbers, 3);
        System.out.println(numbers);
        System.out.println("-".repeat(30));
        Collections.shuffle(numbers);
        System.out.println(numbers);

    }
}
