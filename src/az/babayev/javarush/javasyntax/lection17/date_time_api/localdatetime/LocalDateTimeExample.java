package az.babayev.javarush.javasyntax.lection17.date_time_api.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        date.setMonth(12);
        System.out.println(date);
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTime());
        instance.add(Calendar.MONTH,2);
        System.out.println(instance.getTime());

        System.out.println("-".repeat(40));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("Local date -> "+localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time -> "+localTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println("Local date time -> "+localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(
                2020, Month.JANUARY, 12, 12, 43);
        System.out.println(localDateTime2);

    }
}
