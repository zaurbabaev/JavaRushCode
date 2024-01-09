package az.babayev.javarush.javasyntax.lection9;

import java.math.BigDecimal;

public class MathEx {
    public static void main(String[] args) {
        double sin = Math.sin(Math.toRadians(30));
        System.out.println(sin);

        double degrees = Math.toDegrees(0.5);
        System.out.println(degrees);

        double pi = Math.PI;
        System.out.println(pi);

        double e = Math.E;
        System.out.println(e);

        double pow = Math.pow(2, 0.25);
        System.out.println(pow);
    }
}
