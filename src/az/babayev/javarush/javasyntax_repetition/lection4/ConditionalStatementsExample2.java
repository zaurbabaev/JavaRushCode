package az.babayev.javarush.javasyntax_repetition.lection4;

import java.util.Scanner;

public class ConditionalStatementsExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Совершеннолетний, можно покупать машину.");
        } else {
            System.out.println("Рано еще для машины.");
        }
    }

}
