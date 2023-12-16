package az.babayev.javarush.javasyntax.task.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
 */
public class Task11_04 {
    public static void main(String[] args) throws IOException {
        List<Integer> integers = getIntegerList();
        System.out.println(integers);
        int minimum = getMinimum(integers);
        System.out.println(minimum);

    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);

    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        return numbers;
    }
}
