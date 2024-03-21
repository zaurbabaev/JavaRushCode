package az.babayev.javarush.javasyntax.repetition;

public class FactorialRecursion {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
        System.out.println("-".repeat(15));
        recursion(5);
        System.out.println();
        System.out.println("-".repeat(15));
        recursion2(5);
    }

    public static int factorial(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }

    public static void recursion(int i) {
        if (i > 0) {
            recursion(i - 1);
            System.out.print(i+" "); //1 2 3 4 5
        }
    }

    public static void recursion2(int i) {
        if (i > 0) {
            System.out.print(i+" "); //5 4 3 2 1
            recursion2(i - 1);
        }
    }


}
