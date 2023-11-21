package az.babayev.javarush.javasyntax.lection3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scannerForString = new Scanner(System.in);
        Scanner scannerForInt = new Scanner(System.in);
        System.out.println("Input your name ");
        String name = scannerForString.nextLine();
        System.out.println("Input your age");
        int age = scannerForInt.nextInt();
        System.out.println("Input your surname");
        String surname = scannerForString.nextLine();
        System.out.printf("Name -> %s, Surname -> %s, age -> %d %n", name, surname, age);


    }
}
