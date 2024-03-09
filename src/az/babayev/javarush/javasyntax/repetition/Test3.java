package az.babayev.javarush.javasyntax.repetition;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            sum += i;
        }
        System.out.println(sum);
    }
}


