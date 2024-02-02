package az.babayev.javarush.javasyntax.task.task16;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете,
скачивать его и сохранять во временный файл.
Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files,
а также метод openStream() класса URL.
 */
public class SaveFile {
    public static void main(String[] args) throws IOException {
        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            String line = scanner.nextLine();
            URL url = new URL(line);
            InputStream inputStream = url.openStream();
            byte[] bytes = inputStream.readAllBytes();
            Path tempFile = Files.createTempFile(null, null);
            Files.write(tempFile,bytes);

        }
    }
}
