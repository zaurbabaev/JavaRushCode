package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

public class WhileBreakEx {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            if (s.equals("exit")) {
                break;
            }
        }
    }
}
