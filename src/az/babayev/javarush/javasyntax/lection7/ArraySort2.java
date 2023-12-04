package az.babayev.javarush.javasyntax.lection7;

import java.util.Arrays;

public class ArraySort2 {
    public static void main(String[] args) {
        int[] array = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 99);
        System.out.println(index);

        int[] arrayCopy = Arrays.copyOf(array, array.length);

        System.out.println(Arrays.toString(arrayCopy));
    }
}
