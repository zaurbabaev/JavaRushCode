package az.babayev.javarush.javasyntax.repetition;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (console.hasNextInt()) {
                array[i] = console.nextInt();
            }
        }
        Arrays.stream(array).forEach(s -> System.out.print(s + " "));
        System.out.println();

        int min = array[0];

        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }
        System.out.println(min);
    }
}
