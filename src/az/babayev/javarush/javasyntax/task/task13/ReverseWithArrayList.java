package az.babayev.javarush.javasyntax.task.task13;

import java.util.ArrayList;

/*
Ты видишь рабочую программу, в которой массив int[] numbers
заполняется числами в методе init(). Затем в методе reverse() происходит
перестановка чисел в обратном порядке.
Твоя задача — переписать код так, чтобы вместо массива int[] numbers
использовался список ArrayList<Integer> numbers.
Название методов и переменных не изменяй.
Методы main() и print() не принимают участие в проверке.
 */
public class ReverseWithArrayList {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        ArrayList<Integer> copy = new ArrayList<>(numbers);
        int lastIndex = copy.size() - 1;
        for (int i = 0; i < copy.size(); i++) {
            numbers.set(i, copy.get(lastIndex - i));
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // 2ci üsul əlavə ArrayListdən istifadə etmədən List daxilində yerdəyişmə
    public static void reverse2() {
        int lastIndex = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, lastIndex - i);
            numbers.set(lastIndex - i, temp);
        }
    }
}
