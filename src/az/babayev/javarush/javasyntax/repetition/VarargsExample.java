package az.babayev.javarush.javasyntax.repetition;

public class VarargsExample {
    public static void main(String[] args) {
        sum(12, 3, 4, 2, 1, 4);
        sum();
        sum("Hello Java",12,4,5);
        sum("Metanit.com");

    }

    public static void sum(int... n) {
        int result = 0;
        for (int i : n) {
            result += i;
        }
        System.out.println(result);
    }

    public static void sum(String message, int... n) {
        System.out.println(message);
        int result = 0;
        for (int i : n) {
            result += i;
        }
        System.out.println(result);
    }

}
