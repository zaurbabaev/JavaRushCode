package az.babayev.javarush.javasyntax.lection4;

public class WhileEx8 {
    public static void main(String[] args) {
        int n = 0;
        while (n < 4) {
            int m = 0;
            while (m < 5) {
                System.out.print("A");
                m++;
            }
            System.out.println();
            n++;
        }
    }
}
