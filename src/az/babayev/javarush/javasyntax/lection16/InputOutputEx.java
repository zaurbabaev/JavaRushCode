package az.babayev.javarush.javasyntax.lection16;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class InputOutputEx {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             BufferedReader reader = Files.newBufferedReader(Path.of(scanner.nextLine()));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Done!");
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
