package az.babayev.javarush.javasyntax.task.task15;

import java.util.Arrays;
import java.util.Scanner;

/*
Разберись, что делает программа.
В блоке catch выведи на экран переменную answer и брось дальше пойманное исключение.
 */
public class BuyByElephant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.equalsIgnoreCase("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new SecurityException();
        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            System.out.println(answer);
            throw e;
        }
    }
}
