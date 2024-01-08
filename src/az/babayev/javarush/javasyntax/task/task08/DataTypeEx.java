package az.babayev.javarush.javasyntax.task.task08;

/*
Реализуй метод setValues(long value), чтобы он устанавливал полученное
значение параметра value переменным a, b, c и d.
Изменять типы переменных a, b, c и d нельзя.
 */
public class DataTypeEx {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        setValues(100);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void setValues(long value) {
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d =  value;
    }
}
