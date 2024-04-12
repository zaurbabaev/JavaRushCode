package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsExample3 {
    public static Integer min(ArrayList<Integer> list) {
        Integer minimum = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer < minimum) {
                minimum = integer;
            }
        }
        return minimum;
//        Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        int maximum = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer > maximum) {
                maximum = integer;
            }
        }
        return maximum;
//        Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = 0;
        if (element == null) {
            return frequency;
        } else {
            for (Integer integer : list) {
                if (integer.equals(element)) {
                    frequency++;
                }
            }
        }
        return frequency;
//        Collections.frequency(list,element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        int first = 0;
        int end = list.size() - 1;
        int mid = (first + end) >>> 1;
        int index = -1;
        while (first <= end) {
            if (list.get(mid) < key) {
                first = mid + 1;
            } else if (list.get(mid).equals(key)) {
                index = mid;
                break;
            } else {
                end = mid - 1;
            }
            mid = (first + end) >>> 1;
        }
        return index;
//        Collections.binarySearch(list,key);
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 6, 443, 445, 899};
        ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(array));
        int binarySearch = binarySearch(integers, 2);
        System.out.println(binarySearch);
    }

}
