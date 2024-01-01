package az.babayev.javarush.javasyntax.task.task04;

/*
Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3.
 Для этого используй цикл while.

Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
 */
public class WhileEx {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
