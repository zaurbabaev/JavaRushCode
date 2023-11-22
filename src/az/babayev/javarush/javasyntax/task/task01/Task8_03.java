package az.babayev.javarush.javasyntax.task.task01;

/*
Напиши программу, которая выводит на экран квадрат числа 5 с помощью метода sqr.

Подсказка:
В class Solution уже есть метод sqr, который считает квадрат числа.
Чтобы вызвать метод sqr со значением 5, напишиsqr(5).
 */
public class Task8_03 {
    public static void main(String[] args) {
        System.out.println(sqr(5));
    }
    public static int sqr(int a) {
        return a * a;
    }
}
