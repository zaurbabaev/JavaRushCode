package az.babayev.javarush.javasyntax.lection5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForExample {
    public static void main(String[] args) throws IOException {
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (boolean isExit = false; !isExit; ) {
            String string = bufferedReader.readLine();
            isExit = string.equals("exit");
        }

    }
}
