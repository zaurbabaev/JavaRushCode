package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.nio.file.Path;

public class PathExample {
    public static void main(String[] args) {
        Path file = Path.of("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Java.txt");
        Path directory = Path.of("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\");

        Path fileParent = file.getParent();
        System.out.println("File parent -> " + fileParent);
        System.out.println("-".repeat(30));

        Path directoryParent = directory.getParent();
        System.out.println("Directory parent -> " + directoryParent);
        String str = "C:\\";
        Path parent = Path.of(str).getParent();
        System.out.println(parent); // null

        System.out.println("-".repeat(30));
        Path fileFileName = file.getFileName();
        System.out.println("File name -> " + fileFileName);

        System.out.println("-".repeat(30));
        Path directoryFileName = directory.getFileName();
        System.out.println("Directory name -> " + directoryFileName);

        System.out.println("-".repeat(30));
        Path fileRoot = file.getRoot();
        System.out.println("File root -> " + fileRoot);

        System.out.println("-".repeat(30));
        Path directoryRoot = directory.getRoot();
        System.out.println("Directory root -> " + directoryRoot);

        System.out.println("-".repeat(30));
        boolean fileIsAbsolute = file.isAbsolute();
        System.out.println("File is absolute -> " + fileIsAbsolute);

        System.out.println("-".repeat(30));
        boolean directoryAbsolute = directory.isAbsolute();
        System.out.println("Directory is absoute -> " + directoryAbsolute);

        System.out.println("-".repeat(30));
        Path source = Path.of("resources", "test.txt");
        boolean sourceAbsolute = source.isAbsolute();
        System.out.println("Is absolute -> "+sourceAbsolute);

        System.out.println("-".repeat(30));
        Path toAbsolutePath = source.toAbsolutePath();
        System.out.println("To absolute path -> " + toAbsolutePath);

        System.out.println("-".repeat(30));
        Path fileAbsolutePath = file.toAbsolutePath();
        System.out.println(fileAbsolutePath);

        System.out.println("-".repeat(30));
        // «..» это будет означать вернуться на одну директорию назад.
        // windows silinir direktoriya belə olur c:\projects\note.txt
        String str1 = "c:\\windows\\..\\projects\\note.txt";
        Path normalize = Path.of(str1).normalize();
        System.out.println("Normalize -> "+normalize);



    }
}
