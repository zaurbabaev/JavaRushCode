package az.babayev.javarush.javasyntax.lection9;

public class BinaryOperatorsEx {
    public static void main(String[] args) {
        int and1 = 0b0011 & 0b1010;
        System.out.println(Integer.toBinaryString(and1));

        int and2 = 0b1111 & 0b0000;
        System.out.println(Integer.toBinaryString(and2));

        int and3 = 0b1010 & 0b0101;
        System.out.println(Integer.toBinaryString(and3));
        System.out.println("-".repeat(30));

        int or1 = 0b0011 | 0b1010;
        System.out.println(Integer.toBinaryString(or1));

        int or2 = 0b1111 | 0b0000;
        System.out.println(Integer.toBinaryString(or2));

        int or3 = 0b1010 | 0b0101;
        System.out.println(Integer.toBinaryString(or3));

        System.out.println("-".repeat(30));

        int xor1 = 0b0011 ^ 0b1010;
        System.out.println(Integer.toBinaryString(xor1));

        int xor2 = 0b1111 ^ 0b0000;
        System.out.println(Integer.toBinaryString(xor2));

        int xor3 = 0b1010 ^ 0b0101;
        System.out.println(Integer.toBinaryString(xor3));

        System.out.println("-".repeat(30));

        int tilda1 = ~0b0011 ^ 0b1010;
        System.out.println(Integer.toBinaryString(tilda1));

        int tilda2 = ~0b1111;
        System.out.println(Integer.toBinaryString(tilda2));

        int tilda3 = ~0b0101;
        System.out.println(Integer.toBinaryString(tilda3));

        System.out.println("-".repeat(30));
        byte tilda4 = ~(-12);
        System.out.println(tilda4);
        byte tilda5 = ~12;
        System.out.println(tilda5);

        int x = 3;
        int y = 5;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println(x);
        System.out.println(y);

    }
}
