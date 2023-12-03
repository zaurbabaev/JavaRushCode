package az.babayev.javarush.javasyntax.lection11;

import java.util.Arrays;

public class LiteralDemo {
    public static void main(String[] args) {
        byte b = -128;
        short s = 32767;
        int i = 2147483647;
        long l = 214748364789L;
        float f = 1.0F;
        double d = 1.0;
        boolean bb = false;
        char c = 'A';
        char c1 = 0X41;
        char c2 = 65;
        char c3 = '\u0041';
        char c4 = '\u263A';
        char c5 = 0X263A;
        String s1 = "Hello Easter \u263A";
        Object[] literals = {b, s, i, l, f, d, bb, c, c1, c2, c3, c4, c5, s1};
        System.out.println(Arrays.toString(literals));

        String line = "-".repeat(32);
        System.out.println(line);
        System.out.println("DEC     BIN     OCT     HEX");
        System.out.println(line);
        for (int i1 = 0; i1 < 16; i1++) {
            String decimal = String.format("%4d    ", i1);
            String binary = String.format("%4s    ", Integer.toBinaryString(i1));
            String octal = String.format("%4o    ", i1);
            String hexadecimal = String.format("%4x    ", i1);
            System.out.println(decimal + binary + octal + hexadecimal);
        }
        System.out.println(line);

        char z='\u0021';
        System.out.println((int)z);





    }
}
