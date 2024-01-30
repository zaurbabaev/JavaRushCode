package az.babayev.javarush.javasyntax.lection16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class ReaderWriter {
    public static void main(String[] args) {
        Path source = Path.of("resources", "test1.txt");
        Path destination = Path.of("resources", "test1copy1.txt");
        try (FileReader reader = new FileReader(source.toFile());
             FileWriter writer = new FileWriter(destination.toFile());
        ) {
            char[] buffer = new char[65536];// 64 kb
            while (reader.ready()) {
                int real = reader.read(buffer);
                writer.write(buffer, 0, real);
            }
            System.out.println("Done!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
