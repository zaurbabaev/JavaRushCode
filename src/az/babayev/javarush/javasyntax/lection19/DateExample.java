package az.babayev.javarush.javasyntax.lection19;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateExample {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        calendar.set(Calendar.HOUR_OF_DAY, 19);
        calendar.set(Calendar.MINUTE, 55);
        calendar.set(Calendar.SECOND, 45);
        calendar.add(Calendar.MONTH,-2);
        System.out.println(calendar.getTime());
    }
}
