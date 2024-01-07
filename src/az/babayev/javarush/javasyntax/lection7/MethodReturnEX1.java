package az.babayev.javarush.javasyntax.lection7;

import java.util.Arrays;

public class MethodReturnEX1 {

    public static void fill(int[] data, int from, int to, int value) {
        if (from < 0 || to > data.length) {
            return;
        }
        for (int i = from; i < to; i++) {
            data[i] = value;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 23, 453, 24, 252, 2};
        fill(array, 1, 4, 3);
        System.out.println(Arrays.toString(array));
    }
}
