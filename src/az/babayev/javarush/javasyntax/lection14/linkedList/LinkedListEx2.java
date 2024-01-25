package az.babayev.javarush.javasyntax.lection14.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        measureTime(arrayList);
        measureTime(linkedList);
        System.out.println(arrayList.size());
        System.out.println(linkedList.size());
        System.out.println(arrayList.get(2000000));




    }

    private static void measureTime(List<Integer> integers) {
        for (int i = 0; i < 5000_000; i++) {
            integers.add(i);

        }
        
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            integers.add(2000_000, Integer.MAX_VALUE);
        }

        long end = System.currentTimeMillis();

        System.out.println("Время работы (в милисекундах) = " + (end - start));
    }

}
