package az.babayev.javarush.javasyntax.task.task08;

import java.util.Arrays;

/*
Иногда необходимо заполнить какую-то часть массива одинаковыми значениями
или же удалить существующие (присвоить значение null).
Реализуй для этого более гибкий метод
fillArray(Integer[] array, int value, int begin, int end), где:
array — массив, который необходимо заполнить;
value — значение, которым необходимо заполнить;
begin — начиная с какого индекса необходимо заполнять (включительно);
end — на каком индексе остановить заполнение (исключая).
 */
public class FillArray2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));

    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        if (begin < 0 || end > array.length) {
            return;
        }
        for (int i = begin; i < end; i++) {
            array[i] = value;
        }
    }

}
