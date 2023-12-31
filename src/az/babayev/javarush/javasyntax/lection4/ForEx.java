package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (console.hasNextInt()) {
                counter++;
                console.nextLine();
            }
        }
        System.out.println(counter);
    }
}
