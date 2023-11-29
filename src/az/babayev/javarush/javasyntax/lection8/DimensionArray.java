package az.babayev.javarush.javasyntax.lection8;

public class DimensionArray {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            int alphabet_0 = 65;
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alphabet_0 + k) + " ");
            }
            System.out.println();
        }
    }
}

