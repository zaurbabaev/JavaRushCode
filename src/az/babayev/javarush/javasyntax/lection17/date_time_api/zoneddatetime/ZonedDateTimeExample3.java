package az.babayev.javarush.javasyntax.lection17.date_time_api.zoneddatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeExample3 {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        ZoneId zone = now.getZone();
        System.out.println("Zone -> " + zone);

        LocalDateTime localDateTime = now.toLocalDateTime();
        System.out.println("Local date time -> " + localDateTime);

        ZonedDateTime plus1Days = now.plusDays(1);
        System.out.println("Plus 1 days -> " + plus1Days);

        ZonedDateTime plus3Hours = now.plusHours(3);
        ZonedDateTime plus23Minutes = now.plusMinutes(23);
        ZonedDateTime plus30Seconds = now.plusSeconds(30);

        ZonedDateTime plus212131Nanos = now.plusNanos(2312131);
        System.out.println("Plus 212131 nanos -> " + plus212131Nanos);

        ZonedDateTime plus4days = now.plusDays(4);
        System.out.println("Plus 4 days -> " + plus4days);

        ZonedDateTime plus2Weeks = now.plusWeeks(2);
        System.out.println("Plus 2 weeks -> " + plus2Weeks);

        ZonedDateTime plus1Years = now.plusYears(1);
        System.out.println("Plus 1 years -> " + plus1Years);

        ZonedDateTime plus12Days = now.plus(12, ChronoUnit.DAYS);
        System.out.println("Plus 12 days -> " + plus12Days);

        ZonedDateTime plus9Minutes = now.plus(Duration.ofMinutes(9));
        System.out.println("Plus 9 minutes -> " + plus9Minutes);

        ZonedDateTime minus5Days = now.minus(Duration.ofDays(5));
        System.out.println("Minus 5 days -> " + minus5Days);

        ZonedDateTime minus1Years = now.minus(1, ChronoUnit.YEARS);
        System.out.println("Minus 1 years -> " + minus1Years);

        ZonedDateTime minus9Hours = now.minus(Duration.ofHours(9));
        System.out.println("Minus 9 Hours -> " + minus9Hours);

        ZonedDateTime minus2Years = now.minusYears(2);
        System.out.println("Minus 2 years -> " + minus2Years);
    }
}
