package az.babayev.javarush.javasyntax.lection13;

import java.util.Scanner;

public class ObjectEx {
    public static void main(String[] args) {
        Object o = new Scanner(System.in);
        Scanner console= (Scanner) o;
        int i1 = console.nextInt();
        System.out.println(i1);

        Object s = new String("Hello");
        Object s1 = "Hello";
        Object i = Integer.valueOf(5);
        String str=(String) i; // java.lang.ClassCastException  Integeri Stringe mənimsətə etmişik (olmaz)
        System.out.println(str);




    }
}
