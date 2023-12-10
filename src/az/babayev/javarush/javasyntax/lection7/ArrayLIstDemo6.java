package az.babayev.javarush.javasyntax.lection7;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIstDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 12, 3, 21, 34, 456, 86, 3);
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 5, 78, 6, 43, 33);
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        for (Integer i : result) {
            System.out.println(i);
        }

    }
}
