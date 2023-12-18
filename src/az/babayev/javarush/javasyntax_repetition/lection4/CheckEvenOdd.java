package az.babayev.javarush.javasyntax_repetition.lection4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckEvenOdd {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
