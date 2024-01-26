package az.babayev.javarush.javasyntax.lection15;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionEx2 {
    public static void main(String[] args) throws IOException {
        FileInputStream source = null;
        try {
            source = new FileInputStream("c:\\note.txt");
            source.read();
        } catch (Exception exception) {
            System.out.println("Перехватили исключение");
            throw exception;
        } finally {
            if (source != null) {
                source.close();
            }
        }
    }

}
