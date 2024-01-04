package az.babayev.javarush.javasyntax.lection4;

import java.math.BigDecimal;

public class BigDecimalEx1 {
    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal(0.0);
        BigDecimal pointOne = new BigDecimal(0.1);
        for (int i = 0; i < 11; i++) {
            f1 = f1.add(pointOne);
        }

        BigDecimal f2 = new BigDecimal(0.1);
        BigDecimal eleven = new BigDecimal(11);
        f2 = f2.multiply(eleven);

        if (f1.compareTo(f2) == 0) {
            System.out.println("f1 и f2 равны");
        } else {
            System.out.println("f1 и f2 не равны");
        }
    }
}
