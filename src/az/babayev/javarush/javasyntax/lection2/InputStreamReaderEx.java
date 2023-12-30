package az.babayev.javarush.javasyntax.lection2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(
                "C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\data.txt"));
        int ch;
        StringBuilder stringBuilder = new StringBuilder();
        while ((ch = inputStreamReader.read()) != -1) {
            stringBuilder.append((char) ch);
        }
        System.out.println(stringBuilder);


    }
}