package az.babayev.javarush.javasyntax.lection6;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = 999;
        }
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 800);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array,12,40,3);
        System.out.println(Arrays.toString(array));



    }
}
