package az.babayev.javarush.javasyntax.task.task02;

/*
Написать функцию, которая возвращает минимум из трех чисел.

 */
public class Task8_02 {
    public static int min(int a, int b, int c) {
        if (a < b & a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));

    }
}
