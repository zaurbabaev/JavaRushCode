package az.babayev.javarush.javasyntax_repetition.lection5;

public class LoopWhileExample {
    public static void main(String[] args) {
        int i = 2;
        int number=20;
        while (i <= number) {
            if ((i % 2) == 0) {
                System.out.println(i);
                number++;
            }
            i++;

        }
    }
}
