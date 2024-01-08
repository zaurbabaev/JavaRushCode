package az.babayev.javarush.javasyntax.lection8;

public class DataTypeCharacterEx {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);
        char c1 = 65;
        System.out.println(c1);
        char c2 = 0x41;
        System.out.println(c2);
        char c3 = 0x0041;
        System.out.println(c3);
        char c4 = '\u0041';
        System.out.println(c4);
        System.out.println("-".repeat(30));

        char c5 = (char) (c + 1);
        System.out.println(c5);

        char c6 = 'A';
        c6++;
        System.out.println(c6);

        char c7 = 1128;
        System.out.println(c7);

        char c8 = 48;
        System.out.println(c8);

    }
}
