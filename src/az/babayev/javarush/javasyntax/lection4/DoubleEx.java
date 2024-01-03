package az.babayev.javarush.javasyntax.lection4;

public class DoubleEx {
    public static void main(String[] args) {
        double weight = 2;
        System.out.println(weight);
        double d = 1000 * 1000;
        System.out.println(d);
        int i = 100;
        double dd = i * i;
        System.out.println(dd);

        double d1 = 5.999;
        int i1 = 2;
        int i2 = (int) (i1 * d1);
        System.out.println(i2);

        double d2 = 5.0 / 2;
        System.out.println(d2);

        int round = (int) Math.round(4.9);
        System.out.println(round);
    }
}
