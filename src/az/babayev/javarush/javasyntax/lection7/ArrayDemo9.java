package az.babayev.javarush.javasyntax.lection7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDemo9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
        }

        for (int i = 0; i < strings.length; i++) {
            int j = strings.length - i - 1;
            System.out.println(strings[j]);
        }
    }
}
