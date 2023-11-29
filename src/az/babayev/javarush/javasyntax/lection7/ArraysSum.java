package az.babayev.javarush.javasyntax.lection7;

public class ArraysSum {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 7, 8, 10, -3, -5, -6};
        int sum=0;
        for (int number : numbers) {
            sum+=number;
        }
        System.out.println(sum);

    }
}
