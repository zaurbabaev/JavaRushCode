package az.babayev.javarush.javasyntax.lection17.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        System.out.println(date.getTime());
        Date time = date.getTime();
        System.out.println(time);
        Calendar calendar = new GregorianCalendar(2014, Calendar.DECEMBER,3);
        System.out.println(calendar.getTime());
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);


    }
}
