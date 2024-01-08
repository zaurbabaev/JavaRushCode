package az.babayev.javarush.javasyntax.task.task08;

/*
В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами,
чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
Код метода div() изменять нельзя.
 */
public class InfinityEx {
    public static void main(String[] args) {
        div(0, 100.);
        div(0,-100.);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
