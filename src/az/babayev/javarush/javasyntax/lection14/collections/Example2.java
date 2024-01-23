package az.babayev.javarush.javasyntax.lection14.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 34, 5, 4, 3, 2, 9));
        Integer max = Collections.max(integers);
        System.out.println(max);
        Integer min = Collections.min(integers);
        System.out.println(min);


    }
}
