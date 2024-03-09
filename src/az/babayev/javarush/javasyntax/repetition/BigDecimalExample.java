package az.babayev.javarush.javasyntax.repetition;

import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal(0.0);
        BigDecimal pointOne = new BigDecimal(0.1);
        for (int i = 1; i <= 11; i++) {
            d1 = d1.add(pointOne);
        }


        BigDecimal d2 = new BigDecimal(0.1);
        BigDecimal eleven = new BigDecimal(11);
        d2 = d2.multiply(eleven);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        if (d1.compareTo(d2) == 0) {
            System.out.println("d1 and d2 equals");
        } else {
            System.out.println("d1 and d2 not equals");
        }
    }

}
