package az.babayev.javarush.javasyntax_repetition.lection12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalEx {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("2.0");
        BigDecimal b = new BigDecimal("1.1");
        BigDecimal subtract = a.subtract(b);
        System.out.println(subtract);
        BigDecimal divide = a.divide(b, RoundingMode.HALF_DOWN);
        System.out.println(divide);

        double d = 2.0 - 1.1;
        if (d == 0.9) {
            System.out.println("It is 0.9");
        }
        if (Math.abs(d - 0.9) < 0.01) {
            System.out.println("It is real 0.9");
        }

    }
}
