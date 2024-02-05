package az.babayev.javarush.javasyntax.lection17.date_time_api.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.IsoChronology;
import java.time.chrono.IsoEra;

public class LocalDateExample {
    public static void main(String[] args) {
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(System.out::println);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDate localDate = LocalDate.now(zoneId);
        System.out.println("Сейчас в Шанхае -> " + localDate);

        LocalDate localDate1 = LocalDate.of(2023, Month.SEPTEMBER, 23);
        System.out.println(localDate1);

        LocalDate ofYearDay = LocalDate.ofYearDay(2015, 200);
        System.out.println(ofYearDay);

        // 01.01.1970-ci ildən sonrakı gün 1 yazırıqsa 02.01.1970
        LocalDate ofEpochDay = LocalDate.ofEpochDay(1);
        System.out.println(ofEpochDay);

        LocalDate currentDate = LocalDate.now();
        System.out.println("Today -> " + currentDate);

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println("Day of week -> " + dayOfWeek);

        IsoEra era = currentDate.getEra();
        System.out.println("Era -> " + era);

        IsoChronology chronology = currentDate.getChronology();
        System.out.println("Chronology -> " + chronology);

        int dayOfMonth = currentDate.getDayOfMonth();
        System.out.println("Day of Month -> " + dayOfMonth);

        int dayOfYear = currentDate.getDayOfYear();
        System.out.println("Day of year -> " + dayOfYear);

        Month month = currentDate.getMonth();
        System.out.println("Month -> " + month);

        int monthValue = currentDate.getMonthValue();
        System.out.println("Month value -> " + monthValue);


    }
}
