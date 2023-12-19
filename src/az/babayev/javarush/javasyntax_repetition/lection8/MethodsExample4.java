package az.babayev.javarush.javasyntax_repetition.lection8;

import java.util.Arrays;

public class MethodsExample4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        boolean result = equalsArray(array);
        System.out.println(result);
    }

    public static boolean equalsArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = i * 2;
        }
        System.out.println(Arrays.toString(newArray));

        return Arrays.equals(array, newArray);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
