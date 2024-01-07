package az.babayev.javarush.javasyntax.lection7;

public class ArrayMethodEx1 {
    public static void printArraySum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] array = {12, 3, 45, 67, 43};
        printArraySum(array);
    }
}
