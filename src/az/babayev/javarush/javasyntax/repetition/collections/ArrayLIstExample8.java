package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstExample8 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                integers.add(i);
            }
        }

        System.out.print(integers + " ");
        System.out.println();

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 4 == 0) {
                integers.remove(i);
                i--;
            }
        }

    }
}
