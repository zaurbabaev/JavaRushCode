package az.babayev.javarush.javasyntax_repetition.lection6;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        array[2] = array[1];
        array[3] = array[1] + array[2];
        array[6] = array[3] - 6;
        array[9] = 10;

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}
