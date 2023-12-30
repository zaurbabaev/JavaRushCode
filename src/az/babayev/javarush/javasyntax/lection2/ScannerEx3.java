package az.babayev.javarush.javasyntax.lection2;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("""
                Люблю тебя, Петра творенье, 
                Люблю твой строгий, стройный вид,
                Невы державное теченье,
                Береговой ее гранит""");
        String s = sc.nextLine();
        System.out.println(s);
        s=sc.nextLine();
        System.out.println(s);
        s=sc.nextLine();
        System.out.println(s);
        s=sc.nextLine();
        System.out.println(s);


    }
}
