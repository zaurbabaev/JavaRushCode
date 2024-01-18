package az.babayev.javarush.javasyntax.task.task13;

/*
Ты видишь рабочую программу, в которой массив int[] numbers
заполняется числами в методе init(). Затем в методе reverse() происходит
перестановка чисел в обратном порядке.
Твоя задача — переписать код так, чтобы вместо массива int[] numbers
использовался список ArrayList<Integer> numbers.
Название методов и переменных не изменяй.
Методы main() и print() не принимают участие в проверке.
 */
public class ReverseWithArray {
    public static int[] numbers = new int[10];

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }

    public static void reverse() {
        int lastIndex = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[lastIndex - i];
            numbers[lastIndex - i] = temp;
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
