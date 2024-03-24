package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            int j = array.length - i - 1;
            System.out.print(array[j] + " ");
        }

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(console.nextLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            int j = strings.size() - i - 1;
            System.out.print(strings.get(j) + " ");
        }
    }
}
