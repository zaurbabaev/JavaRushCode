package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            String s = console.nextLine();
            isExit = s.equals("exit");
            System.out.println(s);
        }
    }
}
