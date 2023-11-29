package az.babayev.javarush.javasyntax.lection7;

public class MaxMin {
    public static void main(String[] args) {
        int[] ins = {11, 22, 33, 44, 55, 66, 77, 88, -2, 1};
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < ins.length; i++) {
            if (ins[i] < min) {
                min = ins[i];
                index = i;
            }
        }
        System.out.println("Min -> " + min);
        System.out.println("Index -> " + index);

        System.out.println();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ins.length; i++) {
            if (ins[i] > max) {
                max = ins[i];
                index = i;
            }
        }
        System.out.println("Max -> " + max);
        System.out.println("Index -> " + index);
    }
}
