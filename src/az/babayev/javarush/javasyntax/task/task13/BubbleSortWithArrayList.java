package az.babayev.javarush.javasyntax.task.task13;

import java.util.ArrayList;
import java.util.Arrays;

/*
Перед тобой программа, которая сортирует элементы списка по возрастанию методом
"пузырька".
Перепиши код, чтобы вместо списка ArrayList<Integer> numbers
использовался массив int[] numbers.
Методы main() и print() не принимают участие в проверке.
 */
public class BubbleSortWithArrayList {
    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nСортировинные число в натуральном порядке:");
        print();
    }

    public static void sort() {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }


    public static void print() {
        for (Integer number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
