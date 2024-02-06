package az.babayev.javarush.javasyntax.lection17.date_time_api.date_time_formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        var format = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(format);
    }
}
