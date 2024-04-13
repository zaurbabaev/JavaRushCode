package az.babayev.javarush.javasyntax.repetition.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample13 {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if (destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
        for (int i = 0; i < source.size(); i++) {
            destination.set(i, source.get(i));
        }
//        Collections.copy(destination,source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        for (String string : strings) {
            list.add(string);
        }
//        Collections.addAll(list);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if (string.equals(oldValue)) {
                list.set(i, newValue);
            }
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int lastIndex = list.size() - i - 1;
            Integer value = list.get(i);
            Integer lastIndexValue = list.get(lastIndex);
            list.set(lastIndex, value);
            list.set(i, lastIndexValue);
        }
    }


    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("Java", "Java", "Amigo"));
        replaceAll(strings, "Java", "Python");
        System.out.println(strings);

        ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        reverse(integers);
        System.out.print(integers + " ");

    }


}