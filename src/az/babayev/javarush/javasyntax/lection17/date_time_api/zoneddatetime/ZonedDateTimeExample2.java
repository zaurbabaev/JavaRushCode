package az.babayev.javarush.javasyntax.lection17.date_time_api.zoneddatetime;

import java.time.*;

public class ZonedDateTimeExample2 {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        ZoneId zone = now.getZone();
        System.out.println("Zone -> " + zone);

        LocalDateTime localDateTime = now.toLocalDateTime();
        System.out.println("Local date time -> " + localDateTime);

        int year = now.getYear();
        System.out.println("Year -> " + year);

        int dayOfMonth = now.getDayOfMonth();
        System.out.println("Day of month -> " + dayOfMonth);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("Day of week -> " + dayOfWeek);

        int dayOfYear = now.getDayOfYear();
        System.out.println("Day of year -> " + dayOfYear);

        Month month = now.getMonth();
        System.out.println("Month -> " + month);

        int monthValue = now.getMonthValue();
        System.out.println("Month value -> " + monthValue);

        int minute = now.getMinute();
        System.out.println("Minute -> " + minute);

        int second = now.getSecond();
        System.out.println("Second -> " + second);

        int nano = now.getNano();
        System.out.println("Nano -> " + nano);
    }
}
