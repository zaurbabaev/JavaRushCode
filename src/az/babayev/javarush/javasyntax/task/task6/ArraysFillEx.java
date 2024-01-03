package az.babayev.javarush.javasyntax.task.task6;

import java.util.Arrays;

/*
Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
Если длина массива нечётная, то первую большую часть заполнить значениями valueStart,
вторую меньшую — valueEnd. Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
При тестировании значения полей класса Solution будут разными, учти это.
 */
public class ArraysFillEx {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        // Находим середину с помощью тернарного оператора (нет остатка - чет;
        // есть остаток - нечет (прибавляем единицу следуя условию, чтобы заполнить первую бОльшую часть).
        int half = array.length % 2 == 0 ? (array.length / 2) : (array.length / 2) + 1;
        //заполняем первую половину массива значением valueStart
        Arrays.fill(array, 0, half, valueStart);
        // Заполняем вторую половину массива значением valueEnd.
        Arrays.fill(array, half, array.length, valueEnd);
        // Выводим все значения массива.
        System.out.println(Arrays.toString(array));
    }
}
