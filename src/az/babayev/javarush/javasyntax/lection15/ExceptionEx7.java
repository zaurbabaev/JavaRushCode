package az.babayev.javarush.javasyntax.lection15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx7 {
    public static void main(String[] args) {
        printFirstString("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Java.txt");
    }

    public static void printFirstString(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка, файл не найден!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
    }
}
