package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

public class WhileEx9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while (console.hasNextInt()) {
            int i = console.nextInt();
            sum += i;
        }
        System.out.println(sum);
    }
}
