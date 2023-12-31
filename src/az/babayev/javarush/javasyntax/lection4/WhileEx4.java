package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            if (s.equals("exit")) {
                break;
            }
            System.out.println(s);

        }
    }
}
