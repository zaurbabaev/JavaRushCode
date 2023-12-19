package az.babayev.javarush.javasyntax_repetition.lection7;

import java.util.Arrays;

public class ArraySorted2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (1000 - 100 + 1) + 100);
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("-".repeat(30));

        for (int[] i : arr) {
            Arrays.sort(i);
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("-".repeat(30));

        int[] temp = new int[25];
        int k = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                temp[k] = anInt;
                k++;
            }
        }


        for (int i : temp) {
            System.out.print(i + " ");
        }
        Arrays.sort(temp);
        System.out.println("-".repeat(30));
        for (int i : temp) {
            System.out.print(i + " ");
        }

        k = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                k++;
                arr[i][j] = temp[k];
            }
        }
        System.out.println("-".repeat(30));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
