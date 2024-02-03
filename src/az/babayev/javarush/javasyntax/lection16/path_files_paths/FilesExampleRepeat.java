package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExampleRepeat {
    public static void main(String[] args) throws IOException {
        Path createFile = Files.createFile(Paths.get("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Test111.txt"));
        System.out.println("Was the file created successfully?");
        Path filePath = Paths.get("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Test111.txt");
        boolean pathExists = Files.exists(filePath);
        System.out.println(pathExists);
        // folder yarandıqdan sonra biz programi yenidən run etsək o zaman java.nio.file.FileAlreadyExistsException
        // exceptionu almış olacağıq. creatFile-də eynilə belədir. ona görə bu kodları yarandıqdan sonra commet etmişəm
//        Path createFile = Files.createDirectory(Paths.get("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\TestFolder"));
        System.out.println("Was the folder created successfully?");
        Path folderPath = Paths.get("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\TestFolder");
        boolean folderExists = Files.exists(folderPath);
        System.out.println(folderExists);
//        Path moveFile = Files.move(filePath, folderPath.resolve(filePath.getFileName()));
        System.out.println(Files.exists(filePath));

        Files.copy(filePath, folderPath.resolve(filePath.getFileName()));


    }
}
