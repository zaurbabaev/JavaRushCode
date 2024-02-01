package az.babayev.javarush.javasyntax.task.task16;

import java.nio.file.Path;
import java.util.Scanner;

/*
Напиши программу, в которой пользователь вводит с клавиатуры путь к файлу или папке,
после чего в консоли выводится диск (корень для Unix-like), на котором находится
этот файл (или папка).
Для решения задачи используй Path и его методы.
 */
public class PathExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
        ) {
            String str = scanner.nextLine();
            Path root = Path.of(str).getRoot();
            System.out.println(root);
        }
    }
}
