package az.babayev.javarush.javasyntax.task.task03;

/*
Напиши код, который считает сколько секунд прошло с 15:00,
если на часах 15:30. Выведи результат на экран.
 */
public class Task8_05 {
    public static void main(String[] args) {
        int i = secondsAfter15(30);
        System.out.println(i);
    }

    public static int secondsAfter15(int min) {
        return min * 60;
    }
}
