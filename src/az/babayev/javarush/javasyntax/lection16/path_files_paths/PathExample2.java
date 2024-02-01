package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.net.URI;
import java.nio.file.Path;

public class PathExample2 {
    public static void main(String[] args) {
        Path path1 = Path.of("c:\\windows\\projects\\note.txt");
        Path path2 = Path.of("c:\\windows\\");
        // 1ci direktoriyadan(path1) 2ci direktoriyaya(path2) necə keçə bilərik
        // 2 direktoriya geri qaytırmaqla  ->  ..\..
        Path relativize = path1.relativize(path2);
        System.out.println("Relativize -> " + relativize);

        System.out.println("-".repeat(30));
        Path path3 = Path.of("c:\\windows\\projects\\note.txt");
        Path path4 = Path.of("c:\\windows\\");
        // 4cü direktoriyadan(path4) 3cü(path3) necə keçə bilərik
        // 2 direktoriya qabağa getməklə  -> projects\note.txt
        Path relativize2 = path4.relativize(path3);
        System.out.println("Relativize -> " + relativize2);

        System.out.println("-".repeat(30));
        Path path5 = Path.of("projects\\note.txt");
        Path path6 = Path.of("c:\\windows\\");
        // absolut path-i göstərir
        // path5 "projects\\note.txt" path6 "c:\\windows\\"
        // absolut path path6 6da olandır
        Path resolve = path5.resolve(path6);
        System.out.println("Resolve -> " + resolve);

        System.out.println("-".repeat(30));
        Path path7 = Path.of("projects\\note.txt");
        Path path8 = Path.of("c:\\windows\\");
        // path8 c:\windows\ path7  projects\note.txt
        // absolut path path8-dən başlayar sona kimi gedor path7-nidə əhatə edir.
        Path resolve1 = path8.resolve(path7);
        System.out.println("Resolve -> " + resolve1);

        Path path = Path.of("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Java.txt");
        URI uri = path.toUri();
        System.out.println("Uri -> "+uri);
    }
}
