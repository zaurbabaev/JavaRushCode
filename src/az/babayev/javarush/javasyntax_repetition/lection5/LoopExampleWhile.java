package az.babayev.javarush.javasyntax_repetition.lection5;

import java.util.Scanner;

/*
while
 */
public class LoopExampleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мандарин в коробке?");
        int mandarins = scanner.nextInt();
        while (mandarins != 0) {
            System.out.println("Я почистил 1 мандарин.");
            System.out.println("Мандарин в коробке осталось: " + mandarins);
            mandarins--;
        }

        scanner.close();
    }
}
