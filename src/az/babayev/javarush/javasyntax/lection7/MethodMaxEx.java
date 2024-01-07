package az.babayev.javarush.javasyntax.lection7;

public class MethodMaxEx {
    public static int max(int a, int b) {
        return (a > b ? a : b);
    }

    public static void main(String[] args) {
        int a=12, b=40;
        int max = max(a, b);
        System.out.println(max);
    }
}
