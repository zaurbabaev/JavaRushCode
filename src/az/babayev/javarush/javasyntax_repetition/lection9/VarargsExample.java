package az.babayev.javarush.javasyntax_repetition.lection9;

public class VarargsExample {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2,3,4,5));

    }

    public static int sum(int... hello) {
        int sum = 0;
        for (int elem : hello) {
            sum += elem;
        }
        return sum;
    }
}
