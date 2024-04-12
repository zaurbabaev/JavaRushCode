package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsExample2 {
    public static void reverse(ArrayList<Integer> list) {
        ArrayList<Integer> copy = new ArrayList<>(list);
        for (int i = 0; i < copy.size(); i++) {
            int lastIndex = copy.size() - i - 1;
            list.set(lastIndex, copy.get(i));
        }
//        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    int temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        int lastIndex = list.size() - 1;
        for (int i = 0; i < distance; i++) {
            list.add(0, list.get(lastIndex));
            list.remove(lastIndex);
        }
//        Collections.rotate(list,distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomIndexToSwap = random.nextInt(list.size());
            int temp = list.get(randomIndexToSwap);
            list.set(randomIndexToSwap, list.get(i));
            list.set(i, temp);
        }
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(12, 3, 4, 23, 234, 21, 3));
        System.out.println(integers);
//        reverse(integers);
//        System.out.println(integers);
        sort(integers);
        System.out.println(integers);
    }
}
