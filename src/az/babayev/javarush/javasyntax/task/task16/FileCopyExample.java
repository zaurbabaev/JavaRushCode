package az.babayev.javarush.javasyntax.task.task16;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.Scanner;

/*
Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и
копировать файлы из одной директории в другую (только файлы, директории игнорируй).
Используй соответствующие методы класса
Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
 */
public class FileCopyExample {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            Path sourceDirectory = Path.of(scanner.nextLine());
            Path targetDirectory = Path.of(scanner.nextLine());
            try (DirectoryStream<Path> paths = Files.newDirectoryStream(sourceDirectory)) {
                Iterator<Path> iterator = paths.iterator();
                while (iterator.hasNext()) {
                    Path next = iterator.next();
                    if (Files.isRegularFile(next)) {
                        Files.copy(next, targetDirectory.resolve(next.getFileName()));
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

class FileCopyExample2 {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            Path sourceDirectory = Path.of(scanner.nextLine());
            Path targetDirectory = Path.of(scanner.nextLine());
            try (DirectoryStream<Path> paths = Files.newDirectoryStream(sourceDirectory)) {
                for (Path path : paths) {
                    if (Files.isRegularFile(path)) {
                        Files.copy(path, targetDirectory, StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

class FileCopyExample3 {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            Path sourceDirectory = Path.of(scanner.nextLine());
            Path targetDirectory = Path.of(scanner.nextLine());
            try (DirectoryStream<Path> paths = Files.newDirectoryStream(sourceDirectory)) {
                for (Path path : paths) {
                    if (Files.isRegularFile(path)) {
                        Files.copy(path, targetDirectory.resolve(path.getFileName()));
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

