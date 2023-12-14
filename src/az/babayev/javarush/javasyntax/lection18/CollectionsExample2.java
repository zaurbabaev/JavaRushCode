package az.babayev.javarush.javasyntax.lection18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 3, 3, 3, 7, 5, 7, 2, 5, 81);
        List<Integer> numbers2 = new ArrayList<>();
        Collections.addAll(numbers2, 34, 32, 45, 64, 21, 45);
        Integer min = Collections.min(numbers);
        System.out.println("min -> " + min);
        System.out.println("-".repeat(30));
        Integer max = Collections.max(numbers);
        System.out.println("max -> " + max);
        System.out.println("-".repeat(30));
        int frequency = Collections.frequency(numbers, 7);
        System.out.println(frequency);
        System.out.println("-".repeat(30));
        int binarySearch = Collections.binarySearch(numbers, 7);
        System.out.println("binarySearch -> " + binarySearch);
        System.out.println("-".repeat(30));
        boolean disjoint = Collections.disjoint(numbers, numbers2);
        System.out.println("disjoint -> " + disjoint);


    }
}
