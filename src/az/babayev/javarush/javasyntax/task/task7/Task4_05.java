package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */
public class Task4_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        int[] one = new int[10];
        int[] two = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < one.length; i++) {
            one[i] = ints[i];
        }

        for (int i = 0; i < two.length; i++) {
            two[i] = ints[10 + i];
        }
        for (int i : one) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i : two) {
            System.out.println(i+" ");
        }

    }
}
