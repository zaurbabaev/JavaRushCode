package az.babayev.javarush.javasyntax.task.task16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/*
Напиши программу, которая считывает из консоли имя текстового файла,
далее читает символы из этого файла (используй метод readAllLines(Path)
класса Files) и выводит на экран все, за исключением точки, запятой и пробела.
 */
public class FaceControl2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
        ) {
            List<String> list = Files.readAllLines(Path.of(scanner.nextLine()))
                    .stream()
                    .map(element -> element
                            .replace(".", "")
                            .replace(",", "")
                            .replace(" ", ""))
                    .toList();
            list.forEach(System.out::println);


        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }

}
