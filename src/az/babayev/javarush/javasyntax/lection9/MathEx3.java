package az.babayev.javarush.javasyntax.lection9;

public class MathEx3 {

    public static int getRandomDigeNumber() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int x = getRandomDigeNumber();
            System.out.print(x + " ");
        }
    }
}
