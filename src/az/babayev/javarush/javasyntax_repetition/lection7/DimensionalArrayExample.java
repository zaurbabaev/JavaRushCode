package az.babayev.javarush.javasyntax_repetition.lection7;

import java.util.Arrays;

public class DimensionalArrayExample {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][4];
        int[][] twoDimArray2 = {
                {5, 7, 3, 17},
                {7, 0, 1, 12},
                {8, 1, 2, 3}
        };
        for (int i = 0; i < twoDimArray2.length; i++) {
            for (int j = 0; j < twoDimArray2[i].length; j++) {
                System.out.print(" " + twoDimArray2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-".repeat(30));

        System.out.println(Arrays.deepToString(twoDimArray2));
        System.out.println("-".repeat(30));

        for (int[] ints : twoDimArray2) {
            for (int i : ints) {
                System.out.print(" " + i + " ");
            }
            System.out.println();
        }
    }
}
