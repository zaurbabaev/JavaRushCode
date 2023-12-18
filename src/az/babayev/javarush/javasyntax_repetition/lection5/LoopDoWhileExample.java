package az.babayev.javarush.javasyntax_repetition.lection5;

import java.util.Scanner;

public class LoopDoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            s = scanner.nextLine();
        } while (!s.equals("exit"));
        scanner.close();
    }
}
