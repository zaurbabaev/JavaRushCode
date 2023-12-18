package az.babayev.javarush.javasyntax_repetition.lection5;

public class LoopExampleDoWhile {
    public static void main(String[] args) {
        int mandarins = 20;
        do {
            System.out.println("У нас нет мандаринов для чистки");
        } while (mandarins == 0);
    }
}
