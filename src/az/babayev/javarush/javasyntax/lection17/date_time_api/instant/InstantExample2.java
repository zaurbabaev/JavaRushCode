package az.babayev.javarush.javasyntax.lection17.date_time_api.instant;

import java.time.Instant;

public class InstantExample2 {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        long epochSecond = timestamp.getEpochSecond();
        Instant instant = Instant.ofEpochSecond(epochSecond);
        System.out.println(instant);

    }
}
