package az.babayev.javarush.javasyntax.lection16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

/*                   output stream (write)
 application ------------> file
                      input stream (read)
 application <------------ file
 */
public class InputOutputExample2 {
    public static void main(String[] args) {
        Path source = Path.of("resources", "test1.txt");
        Path destination = Path.of("resources", "test1copy.txt");
        try (FileInputStream input = new FileInputStream(source.toFile());
             FileOutputStream output = new FileOutputStream(destination.toFile());
        ) {
            byte[] buffer = new byte[65536];
            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
            System.out.println("Done!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
