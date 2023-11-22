package az.babayev.javarush.javasyntax.lection2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos;
        try (FileInputStream fis = new FileInputStream("data.txt")) {
            fos = new FileOutputStream("result.txt");
            while (fis.available() > 0) {
                int data = fis.read();
                fos.write(data);
            }
        }
        fos.close();

    }
}
