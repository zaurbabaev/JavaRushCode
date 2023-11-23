package az.babayev.javarush.javasyntax.task.task03;

/*
Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.

Подсказка:
будет три миллиона с хвостиком.
 */
public class Task4_04 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 2; i <= 10; i ++) {
            result *= i;
        }
        System.out.println(result);
    }
}
