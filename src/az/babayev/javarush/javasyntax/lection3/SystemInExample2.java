package az.babayev.javarush.javasyntax.lection3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInExample2 {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = bufferedReader.readLine();
            String sAge = bufferedReader.readLine();
            int age = Integer.parseInt(sAge);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
