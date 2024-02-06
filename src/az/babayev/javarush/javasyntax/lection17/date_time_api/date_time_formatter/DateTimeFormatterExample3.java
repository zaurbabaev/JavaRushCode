package az.babayev.javarush.javasyntax.lection17.date_time_api.date_time_formatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterExample3 {
    public static void main(String[] args) {
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, EEEE");

        var isoDateTime = DateTimeFormatter.ISO_DATE_TIME;

        var dateTimeFormatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        var format = LocalTime.now().format(dateTimeFormatter1);
        var localDate = LocalDate.now().format(dateTimeFormatter);
        var date = LocalDate.of(2020, 3, 12).format(dateTimeFormatter);
        System.out.println(localDate);
        System.out.println(format);
        System.out.println(date);

    }
}
