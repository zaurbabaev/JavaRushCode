package az.babayev.javarush.javasyntax.repetition;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        int[] temp = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = temp;


        for (int[] array : matrix) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
