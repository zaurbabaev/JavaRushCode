package az.babayev.javarush.javasyntax.repetition;

import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (console.hasNextInt()) {
                array[i] = console.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }


    }
}
