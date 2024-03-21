package az.babayev.javarush.javasyntax.repetition;

import java.util.stream.IntStream;

public class SortedExample {
    public static void main(String[] args) {
        int[] array = {12, 3, 4, 2, -34, 42, 4567, 2};
        IntStream.iterate(array.length - 1, i -> i >= 0, i -> i - 1)
                .flatMap(i -> IntStream.range(0, i))
                .filter(j -> array[j] > array[j + 1])
                .forEach(j -> {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                });


//        for (int i = array.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
