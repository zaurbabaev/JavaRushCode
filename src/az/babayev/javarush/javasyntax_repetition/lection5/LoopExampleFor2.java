package az.babayev.javarush.javasyntax_repetition.lection5;

import java.util.Scanner;

/*
while
 */
public class LoopExampleFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мандарин в коробке?");
        int mandarins = scanner.nextInt();
        for (int i = 1; i <= mandarins; i++) {
            System.out.println("Я уже почистил " + i + " мандаринов");
        }

        scanner.close();
    }
}

