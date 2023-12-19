package az.babayev.javarush.javasyntax_repetition.lection6;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
