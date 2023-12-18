package az.babayev.javarush.javasyntax_repetition.lection4;

public class CastExample {
    public static void main(String[] args) {
        byte i = 1;
        byte a = (byte) (i + 5);
        short s = 3;
        short s1 = (short) (s + 4);
        System.out.println(a);


        int x, y, z;
        x = (y = (z = 1));
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
