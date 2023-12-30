package az.babayev.javarush.javasyntax.lection2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Мы считали с клавиатуры эту строку:");
        System.out.println(s);
    }
}
