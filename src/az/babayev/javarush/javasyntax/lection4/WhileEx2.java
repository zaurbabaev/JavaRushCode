package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int x=scanner.nextInt();
            System.out.println(x);

        }
    }
}
