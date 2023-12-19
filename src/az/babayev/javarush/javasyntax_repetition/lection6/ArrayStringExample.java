package az.babayev.javarush.javasyntax_repetition.lection6;

import java.util.Arrays;

public class ArrayStringExample {
    public static void main(String[] args) {
        String[] array = new String[4];
        array[0] = "Hello";
        array[1] = ",";
        array[2] = "Amigo";
        System.out.println(Arrays.toString(array));
    }
}
