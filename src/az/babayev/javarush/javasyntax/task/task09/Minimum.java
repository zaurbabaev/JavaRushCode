package az.babayev.javarush.javasyntax.task.task09;

import java.util.Scanner;

/*
В этой задаче тебе нужно:

Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).
 */
public class Minimum {

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        if (console.hasNextInt()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = console.nextInt();
            }
        }
        return array;
    }

    public static int min(int[] ints) {
        int minimum = Integer.MAX_VALUE;
        for (int i : ints) {
            minimum = Math.min(minimum, i);
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

}
