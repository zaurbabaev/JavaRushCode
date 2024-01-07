package az.babayev.javarush.javasyntax.lection7;

import java.util.Arrays;

public class ArrayMethodEx2 {
    public static void fill(int[][] data, int value) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = value;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {12, 34, 54, 32, 1},
                {23, 4, 67, 32, 9},
                {1, 2, 3, 5, 6}
        };
        fill(array,5);
        System.out.println(Arrays.deepToString(array));
    }
}
