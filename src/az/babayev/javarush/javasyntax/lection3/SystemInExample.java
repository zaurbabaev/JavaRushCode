package az.babayev.javarush.javasyntax.lection3;

import java.io.*;

public class SystemInExample {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String name=bufferedReader.readLine();
            String sAge=bufferedReader.readLine();
            int nAge = Integer.parseInt(sAge);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
