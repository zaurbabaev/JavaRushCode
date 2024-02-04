package az.babayev.javarush.javasyntax.lection17.calendar;

import java.util.Calendar;

public class CalendarExample2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current time -> "+calendar.getTime());
        int era = calendar.get(Calendar.ERA);
        System.out.println("Era -> "+era);
        
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Year -> " + year);
        
        int month = calendar.get(Calendar.MONTH);
        System.out.println("Month -> " + month);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day -> "+day);

        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Week -> " + week);

        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hour of day -> "+hourOfDay);

        int hour = calendar.get(Calendar.HOUR);
        System.out.println("Hour -> "+hour);

        int minute = calendar.get(Calendar.MINUTE);
        System.out.println("Minute -> "+minute);

        int second = calendar.get(Calendar.SECOND);
        System.out.println("Second -> "+second);


    }
}
