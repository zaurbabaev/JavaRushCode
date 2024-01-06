package az.babayev.javarush.javasyntax.lection6;

import az.babayev.javarush.javasyntax_repetition.lection6.Array;

import java.util.Arrays;

public class ArraysMethods2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = new int[]{12, 4, 56, 4, 32, 5, 64, 32, 56, 21};
        int[] copy = Arrays.copyOf(array, 15);
        System.out.println(Arrays.toString(copy));
        System.out.println(copy.length);

        int[] copyOfRange = Arrays.copyOfRange(array, 3, 20);
        System.out.println(Arrays.toString(copyOfRange));
        Arrays.sort(array);
        String string = Arrays.toString(array);
        System.out.println(string);

        int binarySearch = Arrays.binarySearch(array, 50);
        System.out.println(binarySearch);
    }
}
