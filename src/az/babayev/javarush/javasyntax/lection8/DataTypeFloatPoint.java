package az.babayev.javarush.javasyntax.lection8;

public class DataTypeFloatPoint {
    public static void main(String[] args) {
        float a = (float) 123456788332.9;
        System.out.println(a);

        float b = (float) 12345.9999;
        System.out.println(b);

        float c = (float) -123.456789E-2;
        System.out.println(c);

        double d = 1234567890.1234567890;
        System.out.println(d);

        double d1 = 1234567890.1234512345;
        System.out.println(d1);

        double in = 9. / 0;
        System.out.println(in);

        double in1 = in + 1;
        System.out.println(in1);

        double nan = in / in1;
        System.out.println(nan);

        double nan1=0.0/0;
        System.out.println(nan1);


    }
}
