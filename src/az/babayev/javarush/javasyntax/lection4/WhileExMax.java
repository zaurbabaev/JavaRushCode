package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

public class WhileExMax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int i = console.nextInt();
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
