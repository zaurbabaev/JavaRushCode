package az.babayev.javarush.javasyntax.lection16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        String src = "C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Java.txt";
        String dest = "C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\JavaCopy1.txt";
        try (
                FileInputStream input = new FileInputStream(src);
                FileOutputStream output = new FileOutputStream(dest);
        ) {
            byte[] buffer = input.readAllBytes();
            output.write(buffer);
            System.out.println("Done!!!");
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }
}
