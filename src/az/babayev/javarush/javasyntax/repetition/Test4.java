package az.babayev.javarush.javasyntax.repetition;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
