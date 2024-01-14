package az.babayev.javarush.javasyntax.lection11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        var fileInputStream = new FileInputStream("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Java.txt");
        var fileOutputStream = new FileOutputStream("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\JavaOUT.txt");
        while (fileInputStream.available() > 0) {
            var read = fileInputStream.read();
            fileOutputStream.write(read);
        }
        fileOutputStream.close();
        fileInputStream.close();


    }
}
