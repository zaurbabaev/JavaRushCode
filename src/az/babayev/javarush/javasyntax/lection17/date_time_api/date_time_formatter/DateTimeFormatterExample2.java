package az.babayev.javarush.javasyntax.lection17.date_time_api.date_time_formatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterExample2 {
    public static void main(String[] args) {

        var dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM-dd-yyyy", Locale.ENGLISH);
        var parse = LocalDate.parse("February-23-2019", dateTimeFormatter);
        var localDate = LocalDate.of(2019,2,23);

        System.out.println(localDate.format(dateTimeFormatter));

        var timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        var localTime = LocalTime.parse("23:59:59",timeFormatter);
        System.out.println(localTime);


    }
}
