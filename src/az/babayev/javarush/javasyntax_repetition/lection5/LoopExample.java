package az.babayev.javarush.javasyntax_repetition.lection5;

/*
while
 */
public class LoopExample {
    public static void main(String[] args) {
        int mandarins = 10;
        while (mandarins > 0) {
            System.out.println("Мандарин в коробке: " + mandarins);
            mandarins--;
        }
    }
}
