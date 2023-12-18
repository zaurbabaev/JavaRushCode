package az.babayev.javarush.javasyntax_repetition.lection5;

import java.util.Scanner;

/*
Verilmiş istənilən ədədin rəqəmlərinin cəmini tapan proqram yaz.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int remainder, result = 0;
        while (number > 0) {
            remainder = number % 10;
            result += remainder;
            number /= 10;
        }
        System.out.println(result);
        sc.close();
    }
}
