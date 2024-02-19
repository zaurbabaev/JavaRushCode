package az.babayev.javarush.javacore.lection3;

import java.io.*;
import java.nio.file.Path;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("C:", "Рабочий стол", "Java proqram.txt");
        Path destination = Path.of("resources", "Java proqram.txt");
        try (
                InputStream input = new FileInputStream(source.toString());
                OutputStream output = new FileOutputStream(destination.toString());
        ) {
            int i;
            while ((i = input.read()) != -1) {
                output.write(i);
            }
            System.out.println("Done!");
        }
    }
}
