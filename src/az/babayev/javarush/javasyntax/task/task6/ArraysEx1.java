package az.babayev.javarush.javasyntax.task.task6;

import az.babayev.javarush.javasyntax_repetition.lection6.Array;

import java.util.Arrays;

/*
Реализуй метод main(String[]), который выводит массивы strings и
ints в консоли с помощью метода Arrays.toString().
 */
public class ArraysEx1 {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
