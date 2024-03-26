package az.babayev.javarush.javasyntax.repetition.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample11 {
    public static void main(String[] args) {
        List<Integer> srcList = new ArrayList<>();
        Collections.addAll(srcList, 99, 98, 97);
        List<Integer> destList = new ArrayList<>();
        Collections.addAll(destList, 1, 2, 3, 4, 5, 6, 7);
        Collections.copy(destList, srcList);
        System.out.println(destList);

        Collections.reverse(destList);
        System.out.println(destList);

        Collections.sort(destList);
        System.out.println(destList);

        Collections.rotate(destList, 3);
        System.out.println(destList);

        Collections.shuffle(destList);
        System.out.println(destList);

        Integer min = Collections.min(destList);
        System.out.println(min);

        Integer max = Collections.max(destList);
        System.out.println(max);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(
                12, 4, 3, 2, 3, 2, 32, 2, 3, 3, 3));
        int frequency = Collections.frequency(numbers, 3);
        System.out.println(frequency);
        Collections.sort(numbers);
        System.out.println(numbers);
        int binarySearch = Collections.binarySearch(numbers, 12);
        System.out.println(binarySearch);

        boolean disjoint = Collections.disjoint(destList, srcList);
        System.out.println(disjoint);


    }
}
