package az.babayev.javarush.javasyntax.lection7;

public class MethodEx3 {
    public static void main(String[] args) {
        int min = min(12, 20);
        System.out.println(min);
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
