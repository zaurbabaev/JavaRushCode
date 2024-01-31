package az.babayev.javarush.javasyntax.task.task16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/*
Напиши программу, которая считывает из консоли имя текстового файла,
далее читает строки из этого файла (используй метод readAllLines(Path) класса Files)
и выводит их на экран через одну, начиная с первой.
 */
public class FileReaderEx {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Path.of(scanner.nextLine()));
            for (int i = 0; i < list.size(); i+=2) {
                System.out.println(list.get(i));
            }
        } catch (IOException ex) {
            System.out.println("Something weak wrong : " + ex);
        }


    }
}
