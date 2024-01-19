package az.babayev.javarush.javasyntax.lection13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VarEx {
    public static void main(String[] args) {
        var i = 23;
        var s = "Hello";
        var console = new Scanner(System.in);
        var array = new int[]{12, 23, 43, 2};
        var integers = new ArrayList<Integer>() {
            {
                add(12);
                add(3);
                add(5);
            }
        };
        System.out.println(integers);

        List<String> list = new ArrayList<>() {
            {
                add("Hello");
                add("Java");
                add("Amigo");
            }
        };

        System.out.println(list);
    }
}
