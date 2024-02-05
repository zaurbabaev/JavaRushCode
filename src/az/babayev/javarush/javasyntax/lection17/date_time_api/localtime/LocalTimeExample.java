package az.babayev.javarush.javasyntax.lection17.date_time_api.localtime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime localTimeFull = LocalTime.of(12, 32, 40, 3242);
        System.out.println(localTimeFull);

        LocalTime localTimeWithHMS = LocalTime.of(14, 3, 45);
        System.out.println(localTimeWithHMS);

        LocalTime localTimeWithHM = LocalTime.of(12, 3);
        System.out.println(localTimeWithHM);

        LocalTime secondOfDay = LocalTime.ofSecondOfDay(3600);
        System.out.println(secondOfDay);

        int hour = now.getHour();
        System.out.println("Hour -> " + hour);

        int minute = now.getMinute();
        System.out.println("Minute -> " + minute);

        int second = now.getSecond();
        System.out.println("Second -> " + second);

        int nano = now.getNano();
        System.out.println("Nano -> " + nano);


    }
}
