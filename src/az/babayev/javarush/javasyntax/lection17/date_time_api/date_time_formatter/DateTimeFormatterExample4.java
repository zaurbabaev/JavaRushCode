package az.babayev.javarush.javasyntax.lection17.date_time_api.date_time_formatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample4 {
    public static void main(String[] args) {
        var dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
        var localTime = LocalTime.now();
        System.out.println(localTime.format(dateTimeFormatter));

    }
}
