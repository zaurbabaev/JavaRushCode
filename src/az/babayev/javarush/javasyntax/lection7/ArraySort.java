package az.babayev.javarush.javasyntax.lection7;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
