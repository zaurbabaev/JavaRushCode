package az.babayev.javarush.javasyntax.lection10;

import java.util.Scanner;

public class StringEx3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        String result = path.replace('/', '\\');
        System.out.println(result);
    }
}
