package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.*;

public class FilesOutputStreamExample {
    public static void main(String[] args) {
        Path path = Path.of("C:\\tempFolder\\readme.txt");
        String str = "\nJava the best programming language";
        try (
                OutputStream outputStream = Files.newOutputStream(path, CREATE,APPEND);
        ) {
            outputStream.write(str.getBytes());
            System.out.println("Done!");

        } catch (
                IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
