package az.babayev.javarush.javasyntax.lection15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx4 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Java1.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка! Файл не найден!");
        }
    }
}
