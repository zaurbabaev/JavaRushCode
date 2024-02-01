package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExample {
    public static void main(String[] args) {
        try {
            Files.createFile(Path.of("C:\\tempFolder\\newfile.txt"));
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

class FilesExample2 {
    public static void main(String[] args) {
        try {
            Files.createDirectory(Path.of("C:\\tempFolder\\A"));
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

class FilesExample3 {
    public static void main(String[] args) {
        try {
            Files.createDirectories(Path.of("C:\\tempFolder\\A\\1\\2\\3\\4"));
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

class FilesExample4 {
    public static void main(String[] args) {
        Path path1 = Path.of("C:\\tempFolder\\newFile.txt");
        Path path2 = Path.of("C:\\tempFolder\\newFileCopy.txt");
        try {
            Files.copy(path1, path2);
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}

class FilesExample5 {
    public static void main(String[] args) {
        Path path1 = Path.of("C:\\tempFolder\\newFile.txt");
        Path path2 = Path.of("C:\\tempFolder\\A\\newFile.txt");
        try {
            Files.move(path1, path2);
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}

class FilesExample6 {
    public static void main(String[] args) {
        Path path = Path.of("C:\\tempFolder\\newFileCopy.txt");
        try {
            Files.delete(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class FilesExample7 {
    public static void main(String[] args) {
        Path path1 = Path.of("C:\\tempFolder\\readme.txt");
        Path path2 = Path.of("C:\\tempFolder\\A\\readmeCopy.txt");
        try {
            Files.copy(path1, path2);
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
