package az.babayev.javarush.javasyntax.repetition;

public class ForExample1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
