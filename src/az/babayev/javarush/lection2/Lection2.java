package az.babayev.javarush.lection2;

public class Lection2 {
    public static void main(String[] args) {
        int x = 0;

        int y = ++x + x++ + --x + x--; // 1 + 1 + 1 + 1
        System.out.println("Result -> " + y);
        System.out.println("x -> " + x);

        int somNumber = 13;
        System.out.println("Remainder -> " + somNumber % 2);

        System.out.println("Last digit -> " + somNumber % 10);
        System.out.println("First digit -> " + (somNumber / 10) % 10);
    }
}
