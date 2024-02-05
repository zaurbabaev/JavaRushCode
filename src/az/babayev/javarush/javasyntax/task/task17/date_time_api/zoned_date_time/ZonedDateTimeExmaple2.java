package az.babayev.javarush.javasyntax.task.task17.date_time_api.zoned_date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
В методе main присвой значение переменной globalTime,
используя переменные localDateTime и zoneId.
 */
public class ZonedDateTimeExmaple2 {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {

        globalTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(globalTime);
    }

}
