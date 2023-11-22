package az.babayev.javarush.javasyntax.task.task02;
/*
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
 */
public class Task8_03 {
    public static int min(int a, int b, int c, int d) {
        if (min(a, b) < c & min(a, b) < c) {
            return min(a, b);
        } else if (c < d) {
            return c;
        } else {
            return d;
        }
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else return b;
    }

    public static void main(String[] args) {
        System.out.println(min(-20,-10));
        System.out.println(min(-40,-10,-30,40));
        System.out.println(min(-20,-10,-40,40));
        System.out.println(min(-20,-10,-30,-40));

    }
}
