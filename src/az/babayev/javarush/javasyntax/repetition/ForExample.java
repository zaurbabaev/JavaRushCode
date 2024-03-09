package az.babayev.javarush.javasyntax.repetition;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) {
                counter++;
            }
            scanner.nextLine();
        }
        System.out.println(counter);
    }
}
