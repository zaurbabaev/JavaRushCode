package az.babayev.javarush.javasyntax_repetition.lection5;

import java.util.Scanner;

/*
İstənilən bir tam ədədin daxilində istifadə edilmiş ən kiçik rəqəmi tapan proqram yaz
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int min = Integer.MAX_VALUE;
        while (number > 0) {
            if (number % 10 < min) {
                min = number % 10;
            }
            number /= 10;
        }
        System.out.println(min);
        sc.close();
    }
}
