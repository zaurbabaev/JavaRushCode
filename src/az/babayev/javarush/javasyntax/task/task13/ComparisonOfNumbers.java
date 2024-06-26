package az.babayev.javarush.javasyntax.task.task13;

/*
В классе ComparisonOfNumbers есть три поля с одинаковыми значениями.
В методе main происходит их сравнение с выводом результата в консоли.
Добавь использование метода equals() в методе main такое минимальное количество раз,
чтобы вывод был:
true
true
true
 */
public class ComparisonOfNumbers {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
