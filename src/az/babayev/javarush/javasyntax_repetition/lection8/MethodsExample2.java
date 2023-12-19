package az.babayev.javarush.javasyntax_repetition.lection8;

import java.util.Arrays;

public class MethodsExample2 {
    public static void main(String[] args) {
        int[] dataOfOne = new int[3];
        int[][] dataOfTwo = new int[3][3];
        int[][][] dataOfThree = new int[3][3][3];
        fillArray(dataOfOne, 1);
        fillArray(dataOfTwo, 2);
        fillArray(dataOfThree, 3);
        System.out.println("-".repeat(30));
        printArray(dataOfOne);
        printArray(dataOfTwo);
        printArray(dataOfThree);
    }

    public static void fillArray(int[] array, int value) {
        Arrays.fill(array, value);
        System.out.println("Success! of 1 dim");
    }

    public static void fillArray(int[][] array, int value) {
        for (int[] ints : array) {
            Arrays.fill(ints, value);
        }
        System.out.println("Success! of 2 dim");
    }

    public static void fillArray(int[][][] array, int value) {
        for (int[][] ints : array) {
            for (int[] anInt : ints) {
                Arrays.fill(anInt, value);
            }
        }
        System.out.println("Success! of 3 dim");
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public static void printArray(int[][][] array) {
        System.out.println(Arrays.deepToString(array));
    }

}
