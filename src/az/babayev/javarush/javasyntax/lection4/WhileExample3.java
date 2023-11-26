package az.babayev.javarush.javasyntax.lection4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExample3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        boolean isExit = false;
        while (!isExit) {
            string = bufferedReader.readLine();
            isExit = "exit".equals(string);
        }
    }
}
