package az.babayev.javarush.javasyntax_repetition.lection6;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int num = 5;
        boolean isFound = false;
        int left = 0;
        int right = array.length;
        while (!isFound && left <= right) {
            int median = (left + right) / 2;
            System.out.println("left = " + left + ", right = " + right + ", median = " + median);
            if (array[median] == num) {
                System.out.println("Found! Position is " + median);
                isFound = true;
            } else if (array[median] > num) {
                System.out.println("Go left");
                right = median - 1;
            } else {
                System.out.println("Go right");
                left = median + 1;
            }
        }
        if (!isFound) {
            System.out.println("Not found!");
        }
    }
}
