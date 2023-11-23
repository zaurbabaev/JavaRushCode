package az.babayev.javarush.javasyntax.task.task03;

/*
Добавь метод public static int convertToSeconds(int hour)
 который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.
 */
public class Task5_02 {
    public static void main(String[] args) {
        int toSeconds = convertToSeconds(1);
        System.out.println(toSeconds);
        int toSeconds2 = convertToSeconds(2);
        System.out.println(toSeconds2);
    }

    public static int convertToSeconds(int hour) {
        return 60 * 60 * hour;
    }
}
