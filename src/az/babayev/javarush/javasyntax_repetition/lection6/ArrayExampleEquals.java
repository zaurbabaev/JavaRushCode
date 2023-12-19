package az.babayev.javarush.javasyntax_repetition.lection6;

import java.util.Arrays;

public class ArrayExampleEquals {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] array2 = {1, 2, 3, 4, 5, 8, 4, 10, 11, 12, 13, 14, 15};
        System.out.println(array1.equals(array2));
        boolean equals = Arrays.equals(array1, array1);
        System.out.println(equals);

        boolean result = true;
        if (array1.length != array2.length) {
            result = false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
        int mismatch = Arrays.mismatch(array1, array2);
        System.out.println(mismatch);
        int compare = Arrays.compare(array1, array2);
        System.out.println(compare);
        int i = Arrays.binarySearch(array1, 14);
        System.out.println(i);
        int[] array3 = new int[5];
        int[] ints = Arrays.copyOf(array1, 5);
        System.out.println(Arrays.toString(ints));
        int[] ints1 = Arrays.copyOfRange(array1, 2, 6);
        System.out.println(Arrays.toString(ints1));
    }
}
