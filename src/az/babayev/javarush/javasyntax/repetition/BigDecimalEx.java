package az.babayev.javarush.javasyntax.repetition;

import java.math.BigDecimal;

public class BigDecimalEx {
    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal("0");
        BigDecimal pointOne = new BigDecimal("0.1");
        for (int i = 1; i <= 11; i++) {
            f1 = f1.add(pointOne);
        }

        BigDecimal f2 = new BigDecimal("0.1");
        BigDecimal eleven = new BigDecimal("11");
        f2 = f2.multiply(eleven);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (f1.compareTo(f2) == 0) {
            System.out.println("f1 and f2 equals");
        } else {
            System.out.println("f1 and f2 not equals");
        }
    }
}
