package az.babayev.javarush.javasyntax.task.task03;

/*
Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.

Пример:
return 123 * 435;
 */
public class Task3_05 {
    public static double addTenPercent(int i) {
//        double percent = i * 10.0 / 100;
        return i + 0.1*i;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
