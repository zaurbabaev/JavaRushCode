package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

public class WhileEx6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int summa = 0;
        while (console.hasNextInt()) {
            int i = console.nextInt();
            summa += i;
        }
        System.out.println(summa);
    }
}
