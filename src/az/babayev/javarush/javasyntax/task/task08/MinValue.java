package az.babayev.javarush.javasyntax.task.task08;

/*
Создай по одной переменной каждого примитивного типа в классе Solution.
Этим переменным присвой минимально возможное для них значение.
Никаких методов создавать не нужно.
 */
public class MinValue {
    public static void main(String[] args) {
        byte b = Byte.MIN_VALUE;
        System.out.println(b);
        short s = Short.MIN_VALUE;
        System.out.println(s);
        int i = Integer.MIN_VALUE;
        System.out.println(i);
        long l = Long.MIN_VALUE;
        System.out.println(l);
        float f = Float.MIN_VALUE;
        System.out.println(f);
        double d = Double.MIN_VALUE;
        System.out.println(d);
        char c = Character.MIN_VALUE;
        System.out.println(c);

    }
}
