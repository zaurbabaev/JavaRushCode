package az.babayev.javarush.javasyntax.lection7;

public class TwoArraysToOneArray {
    public static void main(String[] args) {
        int[] one = {1, 2, 3, 4, 5, 6};
        int[] two = {70, 80, 90, 100};

        int[] result = new int[one.length + two.length];
        for (int i = 0; i < one.length; i++) {
            result[i] = one[i];
        }
        for (int i = 0; i < two.length; i++) {
            result[one.length + i] = two[i];
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
