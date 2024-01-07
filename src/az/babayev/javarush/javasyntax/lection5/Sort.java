package az.babayev.javarush.javasyntax.lection5;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

        int numcopy[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numcopy[i] = numbers[i];
        }

        System.out.println(Arrays.toString(numcopy));
    }
}
