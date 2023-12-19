package az.babayev.javarush.javasyntax_repetition.lection8;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[][] array = {
                {12, 23, 34, 45},
                {12, 45, 57, 78}
        };
        fillArray(array, 0);
        System.out.println(Arrays.deepToString(array));
        printLetter("some next\n",10);
    }

    public static void fillArray(int[][] array, int value) {
        for (int[] ints : array) {
            Arrays.fill(ints, value);
        }
        System.out.println("Success!");
    }

    public static void printLetter(String letter, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(letter);
        }
    }
}
