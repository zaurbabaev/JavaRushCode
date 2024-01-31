package az.babayev.javarush.javasyntax.lection16;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (PrintStream stream = new PrintStream(baos);
                ){
            stream.println("hello");
            stream.println(123);
        }
        String result = baos.toString();
        System.out.println(result);
    }
}
