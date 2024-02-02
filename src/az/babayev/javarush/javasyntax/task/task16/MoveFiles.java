package az.babayev.javarush.javasyntax.task.task16;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и
перемещать файлы из одной директории в другую (только файлы, директории игнорируй).
Используй соответствующие методы
класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), move().
 */
public class MoveFiles {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            Path sourceDirectory = Path.of(scanner.nextLine());
            Path targetDirectory = Path.of(scanner.nextLine());
            try (
                    DirectoryStream<Path> paths = Files.newDirectoryStream(sourceDirectory);
            ) {
                for (Path path : paths) {
                    if (Files.isRegularFile(path)) {
                        Files.move(path, targetDirectory.resolve(path.getFileName()));
                    }
                }

            }
        } catch (IOException e) {
            System.out.println("Something went wrong :" + e);
        }
    }
}
