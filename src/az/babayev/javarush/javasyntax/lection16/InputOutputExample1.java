package az.babayev.javarush.javasyntax.lection16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputExample1 {
    public static void main(String[] args) {
        String src = "C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\JavaRush2.pdf";
        String dest = "C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\JavaRush22.pdf";
        try (
                FileInputStream input = new FileInputStream(src);
                FileOutputStream output = new FileOutputStream(dest);
        ) {
            byte[] buffer = new byte[65536];
            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
            System.out.println("Done!!!");
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }
}
