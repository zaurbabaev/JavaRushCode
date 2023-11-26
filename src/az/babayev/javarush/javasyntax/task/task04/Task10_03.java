package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while.
Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв
 */
public class Task10_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        String stringD = bufferedReader.readLine();
        int number = Integer.parseInt(stringD);
        while (number > 0) {
            System.out.println(string);
            number--;
        }

    }
}
