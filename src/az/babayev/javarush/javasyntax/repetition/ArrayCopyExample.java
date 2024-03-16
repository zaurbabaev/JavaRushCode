package az.babayev.javarush.javasyntax.repetition;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] array={12,5,8,98,75,3,8};
        int[] arrayCopy=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i]=array[i];
        }
        for (int i : arrayCopy) {
            System.out.println(i);
        }
        int[] data = {1, 4, 5, 6, 7, 8, 11};
        int[] array1 = Arrays.copyOf(data, 4);
        System.out.println(Arrays.toString(array1));


    }
}
