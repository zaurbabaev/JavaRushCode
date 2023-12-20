package az.babayev.javarush.javasyntax_repetition.lection11;

public class Literal {
    public static void main(String[] args) {
        int a = 100;
        int a1 = -100;

        long l = 100;
        long l2 = 100L;
        long l3 = 10000000000L;
        long l4 = 1_000_000_000_000_000L;

        double d = 100;
        double d1 = 100.;
        double d2 = .0;
        double d3 = 100.0;

        double d4 = 1d;
        double d5 = 1D;

        float f1 = 100.0F;
        float f2 = 100;

        double d6 = 1.23E2;
        double d7 = 1.23E2F;

        double d8 = 1.23E-6;

        String str = "";
        String str2 = "Some text";
        String str3 = "Concatenation " + "example";

        char ch1 = 'A';
        char ch2 = '\u1f3a';
        char ch3 = '\u2665';
        System.out.println(ch3);

        boolean isOk = true;
        boolean isNotOk = false;

        int i = 100;
        int i2 = 015;
        int i3 = 0b1111;
        int i4 = 0xFFF;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);




    }
}
