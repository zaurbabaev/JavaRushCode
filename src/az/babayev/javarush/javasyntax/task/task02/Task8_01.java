package az.babayev.javarush.javasyntax.task.task02;

/*
Написать функцию, которая возвращает минимум из двух чисел.

 */
public class Task8_01 {
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else return b;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
        System.out.println(min(2, 38));

    }
}
