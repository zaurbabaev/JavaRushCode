package az.babayev.javarush.javasyntax.lection16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2.
Далее все байты из файла1 записывает в файл2,
но при этом меняет их местами по такому принципу: первый со вторым,
третий с четвертым, и т.д.
Если последний байт в файле1 нечетный, то пишем его в файл2 как есть.
Для чтения и записи файлов используй методы newInputStream и newOutputStream
класса Files.
 */
public class InputOutputEx2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()));
        ) {
            byte[] buffer = inputStream.readAllBytes();
            byte[] bytesOut = new byte[buffer.length];
            for (int i = 0; i < buffer.length; i += 2) {
                if (i < buffer.length - 1) {
                    bytesOut[i] = buffer[i + 1];
                    bytesOut[i + 1] = buffer[i];
                } else bytesOut[i] = buffer[i];
            }
            outputStream.write(bytesOut);
        } catch (IOException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
