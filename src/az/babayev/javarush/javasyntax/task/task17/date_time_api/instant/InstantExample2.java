package az.babayev.javarush.javasyntax.task.task17.date_time_api.instant;

import java.time.Duration;
import java.time.Instant;

/*
В классе Solution реализуй шесть методов:

в методе plusMinutes нужно увеличить параметр instant на minutes минут и вернуть результат;
в методе plusHours нужно увеличить параметр instant на hours часов и вернуть результат;
в методе plusDays нужно увеличить параметр instant на days дней и вернуть результат;
в методе minusMinutes нужно уменьшить параметр instant на minutes минут и вернуть результат;
в методе minusHours нужно уменьшить параметр instant на hours часов и вернуть результат;
в методе minusDays нужно уменьшить параметр instant на days дней и вернуть результат.
 */
public class InstantExample2 {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));


    }

    //1970-01-01T00:02:10Z
    static public Instant plusMinutes(Instant instant, long minutes) {
//        return instant.plusSeconds(minutes * 60);
//        return instant.plus(minutes, ChronoUnit.MINUTES);
        return instant.plus(Duration.ofMinutes(minutes));
    }

    //1970-01-01T02:00:10Z
    static public Instant plusHours(Instant instant, long hours) {
//        return instant.plusSeconds(hours * 60 * 60);
//        return instant.plus(hours, ChronoUnit.HOURS);
        return instant.plus(Duration.ofHours(hours));
    }

    //1970-01-03T00:00:10Z
    static public Instant plusDays(Instant instant, long days) {
//        return instant.plusSeconds(days * 24 * 60 * 60);
//        return instant.plus(days, ChronoUnit.DAYS);
        return instant.plus(Duration.ofDays(days));
    }

    //1969-12-31T23:58:10Z
    static public Instant minusMinutes(Instant instant, long minutes) {
//        return instant.minusSeconds(minutes * 60);
//        return instant.minus(minutes, ChronoUnit.MINUTES);
        return instant.minus(Duration.ofMinutes(minutes));
    }

    //1969-12-31T22:00:10Z
    static public Instant minusHours(Instant instant, long hours) {
//        return instant.minusSeconds(hours * 60 * 60);
//        return instant.minus(hours, ChronoUnit.HOURS);
        return instant.minus(Duration.ofHours(hours));
    }


    //1969-12-30T00:00:10Z
    static public Instant minusDays(Instant instant, long days) {
//        return instant.minusSeconds(days * 24 * 60 * 60);
//        return instant.minus(days, ChronoUnit.DAYS);
        return instant.minus(Duration.ofDays(days));
    }


}
