package az.babayev.javarush.javasyntax.task.task6;

import java.util.Arrays;

/*
Реализуй метод main(String[]), который выводит массивы strings и
ints в консоли c помощью метода Arrays.deepToString(Object[][]).
 */
public class ArraysEx2 {
    public static String[][] strings = new String[][]{
            {"🙂", "🙂", "🙂", "🙂"},
            {"🙃", "🙃", "🙃", "🙃"},
            {"😋", "😋", "😋", "😋"},
            {"😎", "😎", "😎", "😎"}
    };
    public static int[][] ints = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));
    }
}
