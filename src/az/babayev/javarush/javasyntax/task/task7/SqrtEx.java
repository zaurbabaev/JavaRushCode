package az.babayev.javarush.javasyntax.task.task7;

/*
Метод printSqrt(int[] array) должен выводить корень квадратный для каждого элемента переданного массива.
Но этого не происходит из-за конфликта имен переменных. Исправь имена переменных так, чтобы код компилировался.
В результате работы программа должна выводить в консоли соответствующую строку для каждого элемента массива.

Пример строки:
Корень квадратный для числа 64 равен 8.0
 */
public class SqrtEx {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrtString = "Корень квадратный для числа ";
        for (int element : array) {
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrtString + element + " равен " + elementSqrt);
        }
    }
}
