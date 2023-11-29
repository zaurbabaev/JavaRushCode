package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 */
public class Task4_04 {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = ints.length - 1; i >= 0; i--) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        for (int i : ints) {
            System.out.println(i);
        }

    }
}
