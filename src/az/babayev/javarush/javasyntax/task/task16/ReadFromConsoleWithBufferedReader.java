package az.babayev.javarush.javasyntax.task.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Программа считывает из консоли строку и выводит ее на экран, чередуя регистр
символов: первый символ — в нижнем регистре, второй — в верхнем, третий — в нижнем,
и т.д. Не меняя функциональности программы, перепиши код с использованием
BufferedReader для чтения из консоли.
 */
public class ReadFromConsoleWithBufferedReader {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String line = reader.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.println(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.println(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

