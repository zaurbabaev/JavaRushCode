package az.babayev.javarush.javasyntax.lection8;

import java.util.Arrays;

public class ReferenceEx {
    public static void main(String[] args) {
        String s = null;
        s = "Hello";
        System.out.println(s);
        s = null;
        System.out.println(s);

        String[] strings = new String[10];
        fill(strings, "Java");
        System.out.println(Arrays.toString(strings));


    }

    public static void fill(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
