package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int count = 0;

        while (i < 3) {
            int number1 = Integer.parseInt(reader.readLine());
            int positive = (number1 > 0) ? count++ : 0;
            i++;
        }

        System.out.println(count);

    }
}
