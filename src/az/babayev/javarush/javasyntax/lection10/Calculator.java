package az.babayev.javarush.javasyntax.lection10;

public class Calculator {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int i1 = 1; i1 <= 10; i1++) {
                System.out.print(i * i1 + "\t");
            }
            System.out.println();
        }
    }
}
