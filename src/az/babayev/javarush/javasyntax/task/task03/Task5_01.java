package az.babayev.javarush.javasyntax.task.task03;

/*
Реализуй метод public static void writeToConsole(String s),
 который добавляет к началу строки выражение "printing:
 "и выводит измененную строку на экран.

Пример вывода для "Hello world!":
printing: Hello world!
 */
public class Task5_01 {
    public static void main(String[] args) {
        writeToConsole("Hello");
    }

    public static void writeToConsole(String s) {
        System.out.println("printing: " + s);
    }
}
