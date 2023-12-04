package az.babayev.javarush.javasyntax.lection7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < strings.size(); i++) {
            int j = strings.size() - i - 1;
            System.out.println(strings.get(j));
        }
    }
}
