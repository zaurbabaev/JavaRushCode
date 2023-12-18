package az.babayev.javarush.javasyntax_repetition.eolymp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задано трехзначное число. Какая цифра в нем больше: первая или последняя?
 */
public class FirstOrLast {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int lastDigit = number % 10;
        int firstDigit = number / 100;

        int max = Math.max(lastDigit, firstDigit);
        System.out.println(max);


    }
}
