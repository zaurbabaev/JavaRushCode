package az.babayev.javarush.javasyntax_repetition.lection3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner consoleInt = new Scanner(System.in);
        Scanner consoleString = new Scanner(System.in);
        String name = consoleString.nextLine();
        int age = consoleInt.nextInt();
        String surname = consoleString.nextLine();
        System.out.println(name + " " + age + " -" + surname + " -");
    }
}
