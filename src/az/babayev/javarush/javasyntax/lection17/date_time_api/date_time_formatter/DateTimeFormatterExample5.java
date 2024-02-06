package az.babayev.javarush.javasyntax.lection17.date_time_api.date_time_formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterExample5 {
    public static void main(String[] args) {
        var dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        var localDate = LocalDate.now().format(dateTimeFormatter);
        System.out.println(localDate);

        System.out.println("-".repeat(30));

        var dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(
                FormatStyle.LONG, FormatStyle.MEDIUM).localizedBy(new Locale("ru"));
        var formatDateTime = LocalDateTime.now().format(dateTimeFormatter1);
        System.out.println(formatDateTime);

        System.out.println("-".repeat(30));

        var dateTimeFormatter2 = DateTimeFormatter.ofPattern(
                "HH:mm:ss a, dd MMMM yyyy").localizedBy(new Locale("ru"));
        var localDateTime = LocalDateTime.of(
                2020, 12, 5, 12, 26, 1).format(dateTimeFormatter2);
        System.out.println(localDateTime);

    }
}
