package az.babayev.javarush.javasyntax.lection17.date_time_api.localtime;

import java.time.LocalTime;

public class LocalTimeExample2 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time -> " + currentTime);

        LocalTime plusHours = currentTime.plusHours(1);
        System.out.println("Plus 1 hours -> " + plusHours);
        LocalTime plusMinutes = currentTime.plusMinutes(30);
        System.out.println("Plus 30 minutes -> " + plusMinutes);
        LocalTime plusSeconds = currentTime.plusSeconds(20);
        System.out.println("Plus 20 seconds -> " + plusSeconds);
        LocalTime plusNanos = currentTime.plusNanos(12);
        System.out.println("Plus 12 nanoseconds -> " + plusNanos);

        System.out.println("-".repeat(40));
        LocalTime minusHours = currentTime.minusHours(1);
        System.out.println("Minus 1 hours -> " + minusHours);
        LocalTime minusMinutes = currentTime.minusMinutes(30);
        System.out.println("Minus 30 minutes -> " + minusMinutes);
        LocalTime minusSeconds = currentTime.minusSeconds(20);
        System.out.println("Minus 20 seconds -> " + minusSeconds);
        LocalTime minusNanos = currentTime.minusNanos(12);
        System.out.println("Minus 12 nanoseconds -> " + minusNanos);


    }
}
