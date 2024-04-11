package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    private static List<Integer> numbers = new ArrayList<>();

    private static void init() {
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10);
        }
    }

    private static void reverse() {
        List<Integer> copy = new ArrayList<>(numbers);
        for (int i = 0; i < copy.size(); i++) {
            int lastIndex = copy.size() - i - 1;
            numbers.set(lastIndex, copy.get(i));
        }
    }

    private static void print() {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        init();
        print();
        reverse();
        print();
    }
}
