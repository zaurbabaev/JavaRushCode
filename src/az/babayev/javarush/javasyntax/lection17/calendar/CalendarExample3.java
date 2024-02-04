package az.babayev.javarush.javasyntax.lection17.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample3 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println("Current calendar -> "+instance.getTime());
        instance.set(Calendar.MONTH,12);
        System.out.println("Current time plus 3 month -> "+instance.getTime());

        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR,2024);
        calendar.set(Calendar.MONTH,1);
        calendar.set(Calendar.DATE,3);
        calendar.set(Calendar.HOUR_OF_DAY,12);
        calendar.set(Calendar.MINUTE,20);

        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH,2);
        System.out.println(calendar.getTime());

        calendar.roll(Calendar.DATE,20);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.DATE,-3);
        System.out.println(calendar.getTime());
    }
}
