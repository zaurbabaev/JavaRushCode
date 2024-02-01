package az.babayev.javarush.javasyntax.lection16;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamExample {
    public static void main(String[] args) {
        Path source = Path.of("resources", "test.txt");
        try (FileInputStream input = new FileInputStream(source.toFile());
        ) {
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}

class ReaderExample {
    public static void main(String[] args) {
        Path source = Path.of("resources", "test.txt");
        try (FileReader reader = new FileReader(source.toFile());
        ) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
