package az.babayev.javarush.javasyntax.repetition;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class FibonacciArrayExample {
    public static void main(String[] args) {
        int[] values = new int[10];
        fibonacci(values);

        System.out.println(Arrays.toString(values));

    }

    private static void fibonacci(int[] values) {
        values[0] = 0;
        values[1] = 1;
        for (int i = 2; i < values.length; i++) {
            values[i] = values[i - 1] + values[i - 2];
        }
    }


}
