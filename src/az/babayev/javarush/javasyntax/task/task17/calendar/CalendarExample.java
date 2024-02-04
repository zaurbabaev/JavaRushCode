package az.babayev.javarush.javasyntax.task.task17.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
Цикл while должен был завершиться за 31 итерацию,
но почему-то зациклился. Найди и исправь ошибку.
 */
public class CalendarExample {
    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.println("Старт");
        while (start.before(end)) {
            start.add(Calendar.DATE, 1);
            System.out.println(".");
        }
        System.out.println("  Финиш ");
    }
}
