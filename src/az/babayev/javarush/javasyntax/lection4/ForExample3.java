package az.babayev.javarush.javasyntax.lection4;

public class ForExample3 {
    public static void main(String[] args) {
        for (int i = 5, j = 11; i != j; i++, j--) {
            System.out.println("i: " + i + " j: " + j);
        }
    }
}
