package az.babayev.javarush.javasyntax_repetition.lection8;

import java.util.Arrays;

public class MethodsExample3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (i == 5) {
                return;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
