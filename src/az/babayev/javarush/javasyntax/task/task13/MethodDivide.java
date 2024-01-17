package az.babayev.javarush.javasyntax.task.task13;


/*
Реализуй метод divide(double a, double b) так, чтобы в консоли выводился
 результат деления числа a на число b.
Должно выводиться следующее значение:
Double.POSITIVE_INFINITY, если верен любой из следующих пунктов:
a положительное и b равно 0;
a равно Double.POSITIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;
Double.NEGATIVE_INFINITY, если верен любой из следующих пунктов:
a отрицательное и b равно 0;
a равно Double.NEGATIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
a равно Double.POSITIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;
Double.NaN, если верен любой из следующих пунктов:
a равно 0 и b равно 0;
хотя бы один из операндов равен Double.NaN;
a равно Double.POSITIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
a равно Double.POSITIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
Иначе выводить результат деления a на b.
 */
public class MethodDivide {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        divide(a,b);
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);

    }

    public static void divide(double a, double b) {
        double result = a / b;
        System.out.println(result);

    }
}
