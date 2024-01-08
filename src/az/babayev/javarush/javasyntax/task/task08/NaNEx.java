package az.babayev.javarush.javasyntax.task.task08;

/*
В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN".
Код метода div() изменять нельзя.
 */
public class NaNEx {
    public static void main(String[] args) {
        div(0., 0);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
