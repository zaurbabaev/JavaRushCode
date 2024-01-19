package az.babayev.javarush.javasyntax.lection13;

import java.util.ArrayList;

/*
Занесём в список все четные числа от 1 до 20:
 */
public class ArrayListEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                integers.add(i);
            }
        }

        for (int i = 0; i < integers.size(); i++)
            if (integers.get(i) % 4 == 0) {
                integers.remove(i);
                i--;
            }
        for (Integer integer : integers) {
            System.out.print(integer + "\t");
        }
        System.out.println();


    }
}
