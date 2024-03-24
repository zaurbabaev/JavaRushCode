package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample9 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                integers.add(i);
            }

        }

            int n = integers.size();
            integers.remove(n - 3);
            integers.remove(n - 3);
            integers.remove(n - 3);

        System.out.println(integers);

    }
}
