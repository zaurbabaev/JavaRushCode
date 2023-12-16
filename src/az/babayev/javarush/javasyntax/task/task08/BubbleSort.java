package az.babayev.javarush.javasyntax.task.task08;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12, 34, 55, 343, 4357, -4, 0, -543, 9};
        int temp = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
