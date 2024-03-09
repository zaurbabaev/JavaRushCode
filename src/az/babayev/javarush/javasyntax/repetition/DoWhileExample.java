package az.babayev.javarush.javasyntax.repetition;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            s = scanner.nextLine();
            System.out.println(s);
        } while (!(s.equals("exit")));

    }
}
