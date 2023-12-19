package az.babayev.javarush.javasyntax_repetition.lection6;

import java.util.Arrays;

public class ArraysMethodExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(Arrays.toString(array));
        System.out.println("-".repeat(50));

        System.out.println(Arrays.toString(array2));
        System.out.println("-".repeat(50));

        System.out.println("compare -> " + Arrays.compare(array, array2));
        System.out.println("-".repeat(50));

        System.out.println("mismatch -> " + Arrays.mismatch(array, array2));
        System.out.println("-".repeat(50));

        System.out.println("binarySearch key 5 -> " + Arrays.binarySearch(array, 5));
        System.out.println("-".repeat(50));

        int[] array3 = Arrays.copyOf(array, 10);
        System.out.println("copyOf new Length 10 ->" + Arrays.toString(array3));
        System.out.println("-".repeat(50));

        int[] array4 = Arrays.copyOf(array, 20);
        System.out.println("copyOf new Length 20 ->" + Arrays.toString(array4));
        System.out.println("-".repeat(50));

        Arrays.sort(array);
        System.out.println("sort ->" + Arrays.toString(array));
        System.out.println("-".repeat(50));

        int arr[] = {12, 3, 4, 543, 546, 3, 5, 0, 76, 44, 2, 7};
        Arrays.sort(arr, 3, 7);
        System.out.println("sort fromIndex 3 toIndex 7->" + Arrays.toString(arr));
        System.out.println("-".repeat(50));

        int[] array5 = Arrays.copyOfRange(array, 4, 9);
        System.out.println("copyOfRang from 4 to 9 -> " + Arrays.toString(array5));
        System.out.println("-".repeat(50));

        Arrays.fill(array,-1);
        System.out.println("fill -> " + Arrays.toString(array));
        System.out.println("-".repeat(50));
    }

}
