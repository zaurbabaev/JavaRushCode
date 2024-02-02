package az.babayev.javarush.javasyntax.lection16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        Path path = Path.of("resources", "test2.txt");
        try (var fileOutputStream = new FileOutputStream(path.toString(),true);

        ) {
            String str = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, " +
                    "кто хочет стать программистом!\n";
            fileOutputStream.write(str.getBytes());

        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
