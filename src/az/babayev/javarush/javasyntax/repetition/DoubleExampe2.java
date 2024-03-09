package az.babayev.javarush.javasyntax.repetition;

public class DoubleExampe2 {
    public static void main(String[] args) {
        double d1 = 0;
        for (int i = 0; i <= 11; i++) {
            d1 += .1;
        }

        double d2 = 11 * 0.1;

        System.out.println("d1 =" + d1);
        System.out.println("d2 =" + d2);

        if (d1 == d2) {
            System.out.println("d1 and d2 equals");
        } else {
            System.out.println("d1 and d2 not equals");
        }
    }
}
