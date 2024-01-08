package az.babayev.javarush.javasyntax.task.task08;

/*
Создай по одной переменной каждого примитивного типа в классе Solution.
Этим переменным присвой максимально возможное для них значение.
Никаких методов создавать не нужно.
 */
public class MaxValue {
    public static void main(String[] args) {
        byte b = Byte.MAX_VALUE;
        System.out.println(b);
        short s = Short.MAX_VALUE;
        System.out.println(s);
        int i = Integer.MAX_VALUE;
        System.out.println(i);
        long l = Long.MAX_VALUE;
        System.out.println(l);
        float f = Float.MAX_VALUE;
        System.out.println(f);
        double d = Double.MAX_VALUE;
        System.out.println(d);
        char c = Character.MAX_VALUE;
        System.out.println(c);

    }
}
