package az.babayev.javarush.javasyntax.lection16;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class OutputStreamExample {
    public static void main(String[] args) {
        Path source = Path.of("resources", "writer.txt");
        try (FileOutputStream output = new FileOutputStream(source.toFile(), true);
        ) {
            String str = "\nAmigo how are you";
            byte[] bytes = str.getBytes();
            output.write(bytes);
//            output.write(str.getBytes());
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }

    }
}

class WriterExample {
    public static void main(String[] args) {
        Path source = Path.of("resources", "writer2.txt");
        try (FileWriter writer = new FileWriter(source.toFile(),true);
        ) {
            String str = "\nJava is the best";
//            char[] chars = str.toCharArray();
//            writer.write(chars);
            writer.write(str);
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}