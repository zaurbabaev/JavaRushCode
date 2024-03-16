package az.babayev.javarush.javasyntax.repetition;

public class ArrayExample5 {
    public static void main(String[] args) {
        int[][][][] matrix = new int[2][3][4][5];
        matrix = new int[2][][][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[3][][];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new int[4][];
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] = new int[5];
                }
            }
        }

        for (int[][][] ints : matrix) {
            for (int[][] anInt : ints) {
                for (int[] ints1 : anInt) {
                    for (int i : ints1) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
