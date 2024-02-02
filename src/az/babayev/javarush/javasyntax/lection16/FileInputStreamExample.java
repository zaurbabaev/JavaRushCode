package az.babayev.javarush.javasyntax.lection16;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class FileInputStreamExample {
    public static void main(String[] args) {
        var path = Path.of("resources", "test3.txt");
        try (
                var fileInputStream = new FileInputStream(path.toString());
        ) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println("Something went wrong :" + ex);
        }
    }
}
