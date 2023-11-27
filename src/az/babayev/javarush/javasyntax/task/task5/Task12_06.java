package az.babayev.javarush.javasyntax.task.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.
 */
public class Task12_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
