package az.babayev.javarush.javasyntax.task.task17.date_time_api.zoned_date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
В методе main выведи на экран переменную localDateTime в таком виде:
19.03.2020г. 5ч.4мин
 */
public class DateTimeFormatterExample {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
//        String format = dateTimeFormatter.format(localDateTime);
        String format1 = localDateTime.format(dateTimeFormatter);
        System.out.println(format1);
    }
}
