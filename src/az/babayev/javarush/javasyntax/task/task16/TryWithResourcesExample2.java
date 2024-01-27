package az.babayev.javarush.javasyntax.task.task16;

import java.util.Scanner;

/*
Программа считывает с консоли строку и выводит ее на экран в верхнем регистре.
Но оказывается, она не будет работать на старых версиях Java (ниже 7й версии).
Не меняя функциональности программы, перепиши блок try-with-resources на обычный
try-catch.
Не забудь о вызове метода close() для объектов с внешними ресурсами.
 */
public class TryWithResourcesExample2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
