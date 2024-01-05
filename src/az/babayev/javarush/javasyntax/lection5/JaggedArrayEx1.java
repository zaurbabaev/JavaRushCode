package az.babayev.javarush.javasyntax.lection5;

public class JaggedArrayEx1 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][];
        matrix[0] = new int[10];
        matrix[1] = new int[50];

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[1].length);
    }
}
