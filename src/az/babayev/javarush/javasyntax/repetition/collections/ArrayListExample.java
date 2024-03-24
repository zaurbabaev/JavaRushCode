package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        String[] array = new String[10];
        array[0] = "Hello";
        String s = array[0];
        int count = array.length;
        System.out.println(s);

        // Arraylist

        List<String> strings = new ArrayList<>();
        strings.add(0, "Hello");
        strings.get(0);
        int size = strings.size();

    }
}
