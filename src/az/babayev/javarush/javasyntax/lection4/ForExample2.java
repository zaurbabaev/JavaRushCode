package az.babayev.javarush.javasyntax.lection4;

public class ForExample2 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 5; i > 0; i--, a++) {
            System.out.println("Шаг: " + a + " Значение: " + i);
        }
    }
}
