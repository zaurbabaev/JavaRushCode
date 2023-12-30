package az.babayev.javarush.javasyntax.lection2;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Thank you! You enter number " + number);
        } else {
            System.out.println("Sorry, but it isn't number. Restart and try again");
        }
        scanner.close();
    }
}
