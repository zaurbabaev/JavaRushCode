package az.babayev.javarush.javasyntax.lection2;

public class MethodCall1 {
    public static void main(String[] args) {
        int min = min(5, 3);
        System.out.println(min);
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else return b;
    }
}
