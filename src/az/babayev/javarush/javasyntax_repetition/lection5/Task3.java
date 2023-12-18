package az.babayev.javarush.javasyntax_repetition.lection5;

import java.util.Scanner;

/*
İstənilən bir tam ədədin daxilində istifadə edilmiş
ən böyük rəqəmi tapan proqram yaz.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }
        System.out.println(max);
        scanner.close();
    }
}
