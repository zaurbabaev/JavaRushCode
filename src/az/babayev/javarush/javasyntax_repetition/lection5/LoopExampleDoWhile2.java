package az.babayev.javarush.javasyntax_repetition.lection5;

public class LoopExampleDoWhile2 {
    public static void main(String[] args) {
        int x = 10;
        do {
            System.out.println("x= " + x);
            x++;
            System.out.println("\n");
        } while (x < 15);
    }
}
