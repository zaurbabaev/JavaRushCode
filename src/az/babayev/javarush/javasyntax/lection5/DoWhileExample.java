package az.babayev.javarush.javasyntax.lection5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = null;
        do {
            System.out.println(string = bufferedReader.readLine());
        } while (!string.equals("exit"));
    }
}
