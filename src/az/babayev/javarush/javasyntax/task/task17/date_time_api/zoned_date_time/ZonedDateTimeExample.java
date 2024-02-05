package az.babayev.javarush.javasyntax.task.task17.date_time_api.zoned_date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/*
Что общего у всех временных зон и Пекина?
Правильно! Они позволят нам потренироваться в использовании классов
ZoneId и ZonedDateTime :)

Реализуй два метода:

в методе getSortedZones верни множество TreeSet всех временных зон;
в методе getBeijingTime верни текущую дату и время в Пекине
(временная зона для него — "Asia/Shanghai").
 */
public class ZonedDateTimeExample {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());

    }

    public static TreeSet<String> getSortedZones() {
        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }

}
