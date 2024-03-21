package az.babayev.javarush.javacore.task.task6.task1626;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(-10, 100);
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
