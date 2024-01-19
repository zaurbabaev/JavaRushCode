package az.babayev.javarush.javasyntax.lection13;
/*
нужно удалить 3 последних элемента списка.
 */
import java.util.ArrayList;

public class ArrayListEx5 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                integers.add(i);
        }

        System.out.println(integers);
        int n = integers.size();
        System.out.println(n);
        integers.remove(n - 3);
        integers.remove(n - 3);
        integers.remove(n - 3);

        System.out.println(integers);

    }
}
