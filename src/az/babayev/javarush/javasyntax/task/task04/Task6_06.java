package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры имя и возраст.
Если возраст больше 20 вывести надпись "И 18-ти достаточно".
 */
public class Task6_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        int age = Integer.parseInt(sAge);
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }

    }
}
