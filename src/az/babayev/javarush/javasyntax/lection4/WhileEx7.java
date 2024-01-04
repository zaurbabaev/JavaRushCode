package az.babayev.javarush.javasyntax.lection4;

import java.util.Scanner;

public class WhileEx7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isExit=false;
        while (!isExit){
            String s = console.nextLine();
            isExit=s.contains("exit");
        }
    }
}
