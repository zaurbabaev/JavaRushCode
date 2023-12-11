package az.babayev.javarush.javasyntax.lection7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(12);
        number.add(31);
        number.add(14);
        boolean contains = number.contains(31);
        System.out.println(contains);


        var number2 = new ArrayList<>();


    }
}
