package az.babayev.javarush.javasyntax.repetition;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Arrays.stream(array).forEach(s -> System.out.print(s + " "));

        System.out.println('\n' + "-".repeat(30));

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        Arrays.stream(array1).forEach(s -> System.out.print(s + " "));

        System.out.println('\n' + "-".repeat(30));

        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 10 - i;
        }

        Arrays.stream(array2).forEach(s -> System.out.print(s + " "));
    }


}
