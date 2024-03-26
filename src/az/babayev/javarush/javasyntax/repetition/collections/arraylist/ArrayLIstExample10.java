package az.babayev.javarush.javasyntax.repetition.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLIstExample10 {
    public static void main(String[] args) {

        List<String> fake = Collections.nCopies(5, "Hello");
        ArrayList<String> strings = new ArrayList<>(fake);
        System.out.println(strings);


        Collections.replaceAll(strings,"Hello","Java");

        System.out.println(strings);
    }
}
