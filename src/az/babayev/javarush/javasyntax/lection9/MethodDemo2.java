package az.babayev.javarush.javasyntax.lection9;

import java.util.Arrays;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[][] array = {
                {31, 30},
                {12, 2},
                {30, 29},
        };
        fill(array,5);
        System.out.println(Arrays.deepToString(array));
    }

    public static void fill(int[][] data, int value) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = value;
            }
        }
    }
}
