package az.babayev.javarush.javasyntax.lection16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        var path = Path.of("resources", "test3.txt");
        try (
//                var bufferedInputStream = new BufferedInputStream(new FileInputStream(path.toString()));
                BufferedReader reader = Files.newBufferedReader(path);
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
