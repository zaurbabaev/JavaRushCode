package az.babayev.javarush.javasyntax.lection16;

import java.io.IOException;
import java.io.StringWriter;

public class StringWriterEx {
    public static void main(String[] args) {
        String result;
        try (StringWriter writer = new StringWriter()) {
            writer.write("Hello");
            writer.write(String.valueOf(1233));
            result = writer.toString();
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
