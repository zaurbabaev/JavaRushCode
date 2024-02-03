package az.babayev.javarush.javasyntax.lection16.path_files_paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FilesExample11 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Test111.txt");
        List<String> list = Files.readAllLines(filePath, UTF_8);
        list.forEach(System.out::println);
    }
}

class FilesExample12 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Test111.txt");
        List<String> list = Files.readAllLines(filePath, UTF_8);
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (str.startsWith("Как")) {
                String upperCase = str.toUpperCase();
                result.add(upperCase);
            }
        }
        result.forEach(System.out::println);
    }
}

class FilesExample13 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Test111.txt");
        try (Stream<String> stream = Files.lines(filePath)) {
            List<String> result = stream
                    .filter(line -> line.startsWith("Как"))
                    .map(String::toUpperCase)
                    .toList();
            result.forEach(System.out::println);
        }
    }
}
