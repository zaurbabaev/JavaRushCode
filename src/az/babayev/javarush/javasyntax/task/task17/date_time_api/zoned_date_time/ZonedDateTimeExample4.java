package az.babayev.javarush.javasyntax.task.task17.date_time_api.zoned_date_time;

import az.babayev.javarush.javasyntax.lection17.date_time_api.zoneddatetime.ZonedDateTimeExample;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
В методе main выведи на экран переменную zonedDateTime в таком виде:
4 9.3.19 06:03:07.319180500 Europe/Kiev

Где:

4 — номер дня недели, т.е. четверг;
9 — день месяца;
3 — месяц;
19 — год;
06 — часы;
03 — минуты;
07 — секунды;
319180500 — наносекунды;
Europe/Kiev — временная зона.
 */
public class ZonedDateTimeExample4 {
    static ZonedDateTime zonedDateTime=ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String format = dateTimeFormatter.format(zonedDateTime);
        System.out.println(format);
    }

}
