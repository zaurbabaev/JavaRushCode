package az.babayev.javarush.javasyntax.lection13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

        strings.add("Hello");
        strings.add("OK");
        strings.add("How are you");
        strings.add("bye");

        int index = strings.indexOf("OK");
        System.out.println(index);

        String string = strings.get(index);
        System.out.println(string);

        strings.set(index,"Deniz");

        System.out.println(strings);

        String remove = strings.remove(index);

        System.out.println(remove);
        System.out.println(strings);

        boolean contains = strings.contains("bye");
        System.out.println(contains);

        String[] array = strings.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        Object[] array1 = strings.toArray();
        for (Object o : array1) {
            System.out.print(o+",");
        }
        System.out.println();


    }

}
