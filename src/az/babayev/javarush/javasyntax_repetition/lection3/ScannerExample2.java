package az.babayev.javarush.javasyntax_repetition.lection3;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Sum numbers ");
        System.out.print(number1 + number2);
    }
}
