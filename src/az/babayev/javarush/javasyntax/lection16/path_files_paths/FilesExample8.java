package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExample8 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\tempFolder\\readme.txt");
        boolean regularFile = Files.isRegularFile(path);
        System.out.println("Is regular file? -> " + regularFile);

        System.out.println("-".repeat(30));
        boolean directory = Files.isDirectory(path);
        System.out.println("Is directory ? -> " + directory);

        System.out.println("-".repeat(30));
        Path path2 = Path.of("C:\\tempFolder");
        boolean directory2 = Files.isDirectory(path2);
        System.out.println("Is directory? -> " + directory2);

        System.out.println("-".repeat(30));
        boolean fileExists = Files.exists(path);
        boolean directoryExists = Files.exists(path2);
        System.out.println("File exists -> " + fileExists);
        System.out.println("Directory exists -> " + directoryExists);

        System.out.println("-".repeat(30));
        long fileSize = Files.size(path);
        System.out.println("File size -> " + fileSize);

        System.out.println("-".repeat(30));
        long directorySize = Files.size(path2);
        System.out.println("Directory size -> " + directorySize);
    }
}
