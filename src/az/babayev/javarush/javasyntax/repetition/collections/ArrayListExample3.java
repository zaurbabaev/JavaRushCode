package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;

public class ArrayListExample3 {
    static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse2();
        print();

    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
    }

    public static void reverse() {
        int lastIndex = integers.size() - 1;
        ArrayList<Integer> copy = new ArrayList<>(integers);
        for (int i = 0; i < copy.size(); i++) {
            integers.set(i, lastIndex - i);
        }
    }

    public static void reverse2() {
        int lastIndex = integers.size() - 1;
        for (int i = 0; i < integers.size() / 2; i++) {
            int temp = integers.get(i);
            integers.set(i, lastIndex - i);
            integers.set(lastIndex - i, temp);

        }
    }

    public static void print() {
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
