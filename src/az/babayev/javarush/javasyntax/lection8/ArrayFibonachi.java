package az.babayev.javarush.javasyntax.lection8;

public class ArrayFibonachi {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
