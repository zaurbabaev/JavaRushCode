package az.babayev.javarush.javasyntax.repetition;

public class FibonacciExample {
    public static void main(String[] args) {
        int fibonacci = fibonacci(10);
        System.out.println(fibonacci);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }



}
