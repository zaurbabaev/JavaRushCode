package az.babayev.javarush.javasyntax.lection5;

import java.util.Arrays;

public class StringArrayEx {
    public static void main(String[] args) {
        String[] strings = new String[10];
        strings[0] = "Hello";
        strings[1] = strings[0];
        strings[2] = new String("Hello");

        System.out.println(strings[0] == strings[1]);
        System.out.println(strings[0] == strings[2]);
        System.out.println(strings[1] == strings[2]);

        System.out.println(strings[0].equals(strings[2]));
        System.out.println(strings[0].equalsIgnoreCase(strings[2]));
        System.out.println(Arrays.deepToString(strings));
    }
}
