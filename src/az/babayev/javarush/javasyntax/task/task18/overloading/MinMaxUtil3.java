package az.babayev.javarush.javasyntax.task.task18.overloading;

/*
В этой задаче тебе предстоит создать универсальный инструмент для поиска
минимальных и максимальных чисел.
В классе MinMaxUtil создай публичные статические методы min() и max(),
которые в качестве аргументов принимают целочисленные (тип int) значения и
возвращают минимальное и максимальное из них соответственно.

Каждый из методов должен быть перегружен так, чтобы была возможность вызвать
метод с двумя, тремя, четырьмя и пятью параметрами.
В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
Все аргументы методов должны быть типа int.
 */
public class MinMaxUtil3 {
    public static void main(String[] args) {
        System.out.println(min(12, 2));
        System.out.println(min(12, 2, 5));
        System.out.println(min(12, 0, -9, 10));
        System.out.println(min(12, 3, 45, -4, 8));
        System.out.println(max(12, 24));
        System.out.println(max(12, 2, 52));
        System.out.println(max(12, 0, -9, 130));
        System.out.println(max(12, 3, 45, -4, 80));
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return Math.min(min(a, b), c);
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(min(a, b, c), d);
    }

    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(min(a, b, c, d), e);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {

        return Math.max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(max(a, b, c), d);
    }

    public static int max(int a, int b, int c, int d, int e) {
        return Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
    }

}
