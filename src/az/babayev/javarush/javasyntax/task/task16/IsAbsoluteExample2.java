package az.babayev.javarush.javasyntax.task.task16;

import java.nio.file.Path;
import java.util.Scanner;

/*
Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли,
при этом если путь не абсолютный, то перед выводом его нужно преобразовать к
таковому.
 */
public class IsAbsoluteExample2 {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            String str = scanner.nextLine();
            Path path = Path.of(str);
            path = path.isAbsolute() ? path : path.toAbsolutePath();
            System.out.println(path);
        }
    }
}
