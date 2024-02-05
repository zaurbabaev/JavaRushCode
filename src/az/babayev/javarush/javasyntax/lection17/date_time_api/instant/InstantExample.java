package az.babayev.javarush.javasyntax.lection17.date_time_api.instant;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant1 = Instant.ofEpochSecond(123);
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochMilli(3131);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(12313, 31312312312L);
        System.out.println(instant3);


        int nano = instant.getNano();
        System.out.println(nano);

        long epochSecond = instant.getEpochSecond();
        System.out.println(epochSecond);

        long epochMilli = instant.toEpochMilli();
        System.out.println(epochMilli);


    }

}
