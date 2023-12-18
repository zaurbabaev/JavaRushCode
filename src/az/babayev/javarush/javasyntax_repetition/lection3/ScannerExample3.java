package az.babayev.javarush.javasyntax_repetition.lection3;

import java.util.Scanner;

public class ScannerExample3 {
    public static void main(String[] args) {
        String str = ("10 20 30 40");
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(a + b + c + d);
    }
}
