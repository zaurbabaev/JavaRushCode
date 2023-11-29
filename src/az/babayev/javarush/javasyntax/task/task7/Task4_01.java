package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. В методе initializeArray():
1.1. Создай массив на 20 чисел
1.2. Считай с консоли 20 чисел и заполни ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
 */
public class Task4_01 {
    public static void main(String[] args) throws IOException {
        int[] ints = initializeArray();
        int max = max(ints);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] number=new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < number.length; i++) {
            number[i]=Integer.parseInt(reader.readLine());
        }
        return number;
    }

    public static int max(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
