package az.babayev.javarush.javasyntax.lection7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countPersons = Integer.parseInt(reader.readLine());
        String[] persons = new String[countPersons];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = reader.readLine();
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println("persons [" + i + "] = " + persons[i]);
        }
    }
}
