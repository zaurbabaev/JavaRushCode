package az.babayev.javarush.javasyntax.repetition;

public class MathRandomExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandomNumber());
        }

    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 6) + 1;
    }
}
