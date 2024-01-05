package az.babayev.javarush.javasyntax.lection5;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}
        };
        int[] temp = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = temp;

        for (int[] ints : matrix) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
