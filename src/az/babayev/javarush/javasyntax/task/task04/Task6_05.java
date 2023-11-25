package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры имя и возраст.
Если возраст меньше 18 вывести надпись "Подрасти еще".
 */
public class Task6_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String string = bufferedReader.readLine();
        int age = Integer.parseInt(string);
        if (age < 18) {
            System.out.println("Подрасти еще");
        }

    }
}
