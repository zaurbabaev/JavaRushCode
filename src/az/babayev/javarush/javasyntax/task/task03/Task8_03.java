package az.babayev.javarush.javasyntax.task.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!
 */
public class Task8_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        System.out.printf("%s зарабатывает $5,000. Ха-ха-ха!\n", name);

    }
}
