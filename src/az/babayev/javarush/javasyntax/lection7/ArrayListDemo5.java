package az.babayev.javarush.javasyntax.lection7;

import java.util.ArrayList;
import java.util.Collections;

/*
Слияние списков
 */
public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 5, 6, 1, 3, 45, 67, 8);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 8, 6, 7, 45, 3, 23, 9);

        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        System.out.println(result);
    }
}
