package az.babayev.javarush.javasyntax.task.task09;

/*
Исправь методы класса Solution, используя класс Math:

sqrt(double) — должен возвращать квадратный корень переданного аргумента.
cbrt(double) — должен возвращать кубический корень переданного аргумента.
pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.
 */
public class UtilityClassEx2 {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        return Math.pow(number, power);
    }

    public static double pow2(int number, int power) {
        if (power == 0) {
            return 1;
        }
        int modulus = power < 0 ? power * -1 : power;
        int result = number;
        for (int i = 1; i < modulus; i++) {
            result *= number;
        }
        return power < 0 ? 1.0 / result : result;
    }

    public static void main(String[] args) {
        double v = pow2(4, -2);
        System.out.println(v);
        double v1 = pow(4, -2);
        System.out.println(v1);
    }
}
