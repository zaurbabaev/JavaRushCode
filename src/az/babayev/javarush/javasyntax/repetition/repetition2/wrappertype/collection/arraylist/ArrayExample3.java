package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.arraylist;

public class ArrayExample3 {

    public static int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        print();
    }

    private static void sort() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}
