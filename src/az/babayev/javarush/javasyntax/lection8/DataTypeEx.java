package az.babayev.javarush.javasyntax.lection8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTypeEx {
    public static void main(String[] args) throws IOException {
        int n = "Hello".length();
        System.out.println(n);

        String[] array = {"Tic", "Tac", "Toe"};
        int arraylength = array.length;
        System.out.println(arraylength);


        System.out.println("-".repeat(30));

        byte[] buffer = new byte[1024 * 1024];
        try (FileInputStream fis = new FileInputStream("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Java.txt")) {
            try (FileOutputStream fos = new FileOutputStream("C:\\Users\\zaur_\\OneDrive\\Рабочий стол\\Javaout1.txt")) {

                while (true) {
                    int size = fis.read(buffer);
                    fos.write(buffer, 0, size);
                    if (size < buffer.length) {
                        break;
                    }
                }
            }
        }
    }
}