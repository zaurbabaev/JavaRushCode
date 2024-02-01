package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesInputStreamExample {
    public static void main(String[] args) {
        Path path = Path.of("C:\\tempFolder\\readme.txt");
        try (
                InputStream inputStream = Files.newInputStream(path);
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();


        } catch (IOException exception) {
            System.out.println("Something went wrong : " + exception);
        }
    }
}
