package az.babayev.javarush.javasyntax.task.task03;

/*
Напиши код метода sumDigitsInNumber(int number).
Метод на вход принимает целое трехзначное число.
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15
 */
public class Task12_03 {
    public static void main(String[] args) {
        int i = sumDigitsInNumber(546);
        System.out.println(i);
    }

    public static int sumDigitsInNumber(int number) {
        int digit = number;
        int remainder = 0;
        int sum = 0;
        while (digit > 0) {
            remainder = digit % 10;
            digit /= 10;
            sum += remainder;
        }
        return sum;
    }
}
