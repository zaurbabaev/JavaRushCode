package az.babayev.javarush.javasyntax.lection16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamReaderEx {
    public static void main(String[] args) {
        Path source = Path.of("resources", "test1.txt");
        try (BufferedReader reader = new BufferedReader(
                new FileReader(source.toFile()));
        ) {
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }

        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }

    }
}
