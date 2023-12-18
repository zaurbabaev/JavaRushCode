package az.babayev.javarush.javasyntax_repetition.eolymp;

import java.io.IOException;
import java.util.Scanner;

/*
Дано три различных числа a, b, c. Вывести среднее из них.
 */
public class AverageNumber {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //        int max = (a > b)
//                ? ((a > c) ? a : c)
//                : (b > c) ? b : c;
////        int max = Math.max(a, Math.max(b, c));
////        int min = Math.min(a, Math.min(b, c));
//        int min = (a < b)
//                ? ((a < c) ? a : c)
//                : (b < c) ? b : c;
//        int average = (a + b + c) - (max + min);
//        System.out.println(average);
//
//        int max = (a > b)
//                ? ((a > c) ? a : c)
//                : (b > c) ? b : c;

        int average = (a + b + c) - (Math.max(a, Math.max(b, c))
                + Math.min(a, Math.min(b, c)));
        System.out.println(average);

    }
}
