package az.babayev.javarush.javasyntax.lection4;

public class DoubleEx3 {
    public static void main(String[] args) {
        double f1 = 0.0;
        for (int i = 0; i < 11; i++) {
            f1 += .1;
        }

        double f2 = 0.1 * 11;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (Math.abs(f1-f2)<0.00001) {
            System.out.println("f1 и f2 равны!");
        } else {
            System.out.println("f1 и f2 не равны!");

        }
    }

}
