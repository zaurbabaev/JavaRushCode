package az.babayev.javarush.javasyntax.lection17.date_time_api.date_time_formatter;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample6 {
    public static void main(String[] args) {
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss a zzzz");
        var zonedDateTime = ZonedDateTime.now(ZoneId.of("Turkey")).format(dateTimeFormatter);
        System.out.println(zonedDateTime);

    }
}
