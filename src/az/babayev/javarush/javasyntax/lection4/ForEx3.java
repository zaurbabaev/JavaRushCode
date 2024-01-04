package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

// daxil edilən Stringlərdən neçəsi ədəd-dir
public class ForEx3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (console.hasNextInt()) {
                count++;
            }
            console.nextLine();
        }
        System.out.println(count);
    }
}
