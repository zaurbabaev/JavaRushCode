package az.babayev.javarush.javasyntax.task.task16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/*
Есть программа, которая считывает из консоли путь к файлу1 и путь к файлу2 и
копирует содержимое файла1 в файл2.
Но она не работает корректно. Найди и исправь ошибки в коде, чтобы программа
заработала как нужно.
 */
public class FilesCopyExample {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
                var inputStream = Files.newInputStream(Path.of(scanner.nextLine()));
                var outputStream = Files.newOutputStream(Path.of(scanner.nextLine()),CREATE,APPEND);
        ) {
            byte[] buffer = new byte[1024];
            while (inputStream.available() > 0) {
                int real = inputStream.read(buffer);
                outputStream.write(buffer, 0, real);
            }
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
