package az.babayev.javarush.javasyntax.lection4;

public class ForFactorial {
    public static void main(String[] args) {
        int f = 1;
        for (int i = 1; i <= 10; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}
