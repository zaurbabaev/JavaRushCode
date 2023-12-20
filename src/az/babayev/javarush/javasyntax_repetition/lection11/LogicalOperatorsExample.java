package az.babayev.javarush.javasyntax_repetition.lection11;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));

        int x = 342;
        System.out.println(Integer.toBinaryString(x));

        int i1 = 277; // 100010101
        int i2 = 432; // 110110000

        int i3 = i1 & i2;
        System.out.println("i1 & i2 = " + i3); // 100010000

        int i4 = i1 | i2;
        System.out.println("i1 | i2 = " + i4); // 110110101

        int i5 = i1 ^ i2;
        System.out.println("i1 ^ i2 = " + i5); // 010100101
        System.out.println("-".repeat(30));

        int bit1 = 60;
        int bit2 = 13;
        int bit3 = bit1 & bit2;
        System.out.println("bit1 & bit2 = " + bit3);

        int bit4 = bit1 | bit2;
        System.out.println("bit1 | bit2 = " + bit4);

        int bit5 = bit1 ^ bit2;
        System.out.println("bit1 ^ bit2 = " + bit5);

        int bit6 = ~bit1;
        System.out.println("~60 = " + bit6);

        int bit7 = bit1 << 2;
        System.out.println("60 << 2 = "+bit7);

        int bit8 = bit1 >> 2;
        System.out.println("60 >> 2 = "+bit8);

        int bit9 = bit1 >>> 2;
        System.out.println("60 >>> 2 = "+bit9);

    }
}
