package az.babayev.javarush.javasyntax.lection2;

public class MethodCall2 {
    public static void main(String[] args) {
        int min = min(5, 3);
        System.out.println(min);
    }

    public static int min(int a, int b) {
        int c;
        if (a < b) {
            c = a;
        } else {
            c = b;
        }
        return c;
    }
}
