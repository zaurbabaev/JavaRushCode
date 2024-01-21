package az.babayev.javarush.javasyntax.lection14.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12, 34, 53, 24, 214, 1);
        System.out.println(list);

//        Collections.fill(list,12);
//        System.out.println(list);
        List<ArrayList<Integer>> arrayLists = Collections.nCopies(4, list);
        System.out.println(arrayLists);

        Collections.replaceAll(list, 12, 15);
        System.out.println(list);
        List<Integer> list1 = new ArrayList<>(List.of(4, 3, 56, 875, 43, 78, 3));
        Collections.copy(list1, list);
//        list1.removeIf(s -> s > 50);
//        System.out.println("Delete >50 numbers "+list1);
        list1.add(2);
        Collections.reverse(list1);

        Collections.sort(list1);
        System.out.println(list1);

        int index = Collections.binarySearch(list1, 3);
        System.out.println(index);

        Collections.rotate(list1, 3);
        System.out.println(list1);

        Collections.shuffle(list1);
        System.out.println(list1);

        Integer max = Collections.max(list1);
        System.out.println("max -> " + max);

        Integer min = Collections.min(list1);
        System.out.println("min -> " + min);

        int frequency = Collections.frequency(list1, 3);
        System.out.println(frequency);
    }
}
