package az.babayev.javarush.javasyntax.lection17.date_time_api.zoneddatetime;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);
        System.out.println("-".repeat(30));
        ZoneId zone = ZoneId.of("Africa/Cairo");
        System.out.println(zone);
        ZonedDateTime now = ZonedDateTime.now(zone);
        System.out.println(now);
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);
        ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("Turkey"));
        System.out.println(now2);

        LocalDate localDate = now2.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = now2.toLocalTime();
        System.out.println(localTime);
        LocalDateTime localDateTime = now2.toLocalDateTime();
        System.out.println(localDateTime);





    }
}
