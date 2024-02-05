package az.babayev.javarush.javasyntax.task.task17.date_time_api.local_date;

import java.time.LocalDate;

/*
В классе LocalDateExample1 реализуй 4 метода:

метод nowExample должен вернуть текущую дату;
остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.
 */
public class LocalDateExample1 {
    public static LocalDate localDate = LocalDate.of(2020, 9, 12);

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());

    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2020,9,12);
    }

    static LocalDate ofYearDayExample() {
        return LocalDate.ofYearDay(localDate.getYear(), localDate.getDayOfYear());
    }

    static LocalDate ofEpochDayExample() {
        return LocalDate.ofEpochDay(localDate.toEpochDay());
    }


}
