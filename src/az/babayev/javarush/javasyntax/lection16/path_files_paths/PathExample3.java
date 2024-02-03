package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample3 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\tempFolder\\B\\newFile.txt");
        boolean startsWith = path.startsWith("tempFolder");
        System.out.println("StartsWith -> "+startsWith);

        System.out.println("-".repeat(30));
        boolean endsWith = path.endsWith("newFile.txt");
        System.out.println("EndsWith -> "+endsWith);

        System.out.println("-".repeat(30));
        boolean pathAbsolute = path.isAbsolute();
        System.out.println("Absolute path -> "+pathAbsolute);

        System.out.println("-".repeat(30));
        Path path2 = Paths.get("C:\\Users\\Java\\.\\examples");
        Path normalizePath2 = path2.normalize();
        System.out.println("Normalize path2 -> "+normalizePath2);

        System.out.println("-".repeat(30));
        Path path3 = Paths.get("C:\\Users\\Java\\..\\examples");
        System.out.println("Normalize path3 -> "+path3.normalize());

    }
}
