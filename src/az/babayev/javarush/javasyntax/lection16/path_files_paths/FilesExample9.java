package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesExample9 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\tempFolder\\readme.txt");
        List<String> list = Files.readAllLines(path);
        list.forEach(System.out::println);
    }
}

class FilesExample10 {
    public static void main(String[] args) {
        Path path = Path.of("C:\\tempFolder");
        try (
                DirectoryStream<Path> paths = Files.newDirectoryStream(path);
        ) {
            paths.forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
