package az.babayev.javarush.javasyntax.repetition;

public class DoubleExample {
    public static void main(String[] args) {
        double d = 0;

        for (double i = 0; i < 10; i++) {
            d += 0.1;
        }
        System.out.println(d);
    }
}
