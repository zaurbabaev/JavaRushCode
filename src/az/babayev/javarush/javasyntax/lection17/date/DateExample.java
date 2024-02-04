package az.babayev.javarush.javasyntax.lection17.date;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date current = new Date();
        System.out.println("Current time -> " + current);
        long currentTime = current.getTime();
        System.out.println("01.01.1970-ci ildən hazırki vaxta qədər olan millisaniyə -> " + currentTime);

        Date birthday = new Date(87, 2, 1); // 1987 03 01
        System.out.println("Birthday -> " + birthday);
        // year m  d h  m sec
        Date date = new Date(105, 11, 3, 12, 5, 34); //2005 12 3 12 05 34
        System.out.println(date);
        // Date-də il (istədiyimiz il - 1900). ay 0-dan başlayır.
        System.out.println("year -> " + date.getYear()); // il
        System.out.println("Month -> " + date.getMonth()); // ay
        System.out.println("Day -> " + date.getDay()); // həftənin günü
        System.out.println("Date -> " + date.getDate()); // ayın tarixi
        System.out.println("Hours -> " + date.getHours()); // saat
        System.out.println("Minute -> " + date.getMinutes()); // dəqiqə
        System.out.println("Second -> " + date.getSeconds()); // saniyə

        date.setDate(2);
        date.setMonth(2);
        date.setYear(106);
        date.setHours(3);
        date.setMinutes(6);
        date.setSeconds(100);

        System.out.println(date);

        date.setTime(1117876500000L);
        System.out.println(date);

        Date date1 = new Date(1117876500000L);
        System.out.println(date1);


    }
}
