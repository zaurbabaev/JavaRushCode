package az.babayev.javarush.javasyntax.task.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Программа считывает с консоли путь к файлу, читает строки из файла и
выводит их на экран.
Перепиши код программы с использованием try-with-resources:
вынеси в круглые скобки создание объектов с внешними ресурсами.
Не забудь удалить ненужный блок finally и вызовы метода close().
 */
public class TryWithResourcesExample3 {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
                BufferedReader reader = Files.newBufferedReader(Path.of(scanner.nextLine()))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}