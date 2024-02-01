package az.babayev.javarush.javasyntax.task.task16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Напиши программу, которая будет считывать с клавиатуры
строки, и если данная строка — это путь к существующему файлу, выводить в консоли
"<введенная строка> - это файл". Если путь к существующей директории, выводить
в консоли "<введенная строка> - это директория".
Если строка не является путем к файлу или директории, то выходим из программы.
Треугольные скобки и кавычки выводить не нужно.
Для проверки файлов и директорий используй методы isRegularFile() и isDirectory()
класса Files.

Пример вывода:
C:\javarush\text.txt - это файл
C:\javarush\ - это директория

 */
public class FileOrDirectory {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            while (true) {
                Path path = Path.of(scanner.nextLine());
                if (Files.isRegularFile(path)) {
                    System.out.println(path + THIS_IS_FILE);
                } else if (Files.isDirectory(path)) {
                    System.out.println(path + THIS_IS_DIR);
                } else {
                    break;
                }
            }
        }
    }
}
