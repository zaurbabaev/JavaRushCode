package az.babayev.javarush.javasyntax_repetition.lection4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello! Enter your name:");
        String name = reader.readLine();
        System.out.println("Enter your age:");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Till 100 years - " + (100 - age));
        if (age < 18) {
            System.out.println("oh, you are so young!");
        }
        System.out.println("Bye!");
    }
}
