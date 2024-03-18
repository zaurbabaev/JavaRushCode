package az.babayev.javarush.javasyntax.repetition;

public class DoubleExample2 {
    public static void main(String[] args) {
        double d = 987654.321;
        System.out.println(d);
        double d1 = 0.987654321E6;
        System.out.println(d1);

        double a = 1234567890.1234567890;
        System.out.println(a);
        System.out.println(0. / 0);
        System.out.println(100. / 0);
        System.out.println(8.5E-2);
        long l = 1234567890;
        float f = l;
        System.out.println(f);
        double dd = l;
        System.out.println(dd);

        byte b1 = 12;
        byte b2 = 3;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        int i1 = b1 * b2;

        short s = 23;
        byte bb = 4;
        short ss = (short) (s + bb);
        System.out.println(ss);


    }

}
