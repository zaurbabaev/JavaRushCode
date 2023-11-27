package az.babayev.javarush.javasyntax.task.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Текущая реализация: Программа считывает два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа считывает пять чисел с клавиатуры и выводит минимальное из них на экран.
 */
public class Task12_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int minimum = getMin(a, b, c, d, e);
        System.out.println("Minimum = " + minimum);
    }

    private static int getMin(int a, int b, int c, int d, int e) {
        return (a < b) ? a :
                (b < c) ? b :
                        (c < d) ? c :
                                (d < e) ? d : e;

    }

}
