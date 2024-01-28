package az.babayev.javarush.javasyntax.lection16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriterExample {
    public static void main(String[] args) {
        String src = "C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Test1.txt";
        String dest = "C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\TestOUT.txt";
        try (
                FileReader reader = new FileReader(src);
                FileWriter writer = new FileWriter(dest);
        ) {
            char[] buffer = new char[65536]; // 64 kb
            while (reader.ready()) {
                int real = reader.read(buffer);
                writer.write(buffer, 0, real);
            }
            System.out.println("Done!!!");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
