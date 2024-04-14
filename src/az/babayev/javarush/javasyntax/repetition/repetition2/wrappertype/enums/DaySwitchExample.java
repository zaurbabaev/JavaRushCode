package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaySwitchExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dayOfWeek = reader.readLine();
        Day day = Day.valueOf(dayOfWeek.toUpperCase());
        System.out.println(
                switch (day) {
                    case MONDAY -> "Monday";
                    case TUESDAY -> "Tuesday";
                    case WEDNESDAY -> "Wednesday";
                    case THURSDAY -> "Thursday";
                    case FRIDAY -> "Friday";
                    case SATURDAY -> "Saturday";
                    case SUNDAY -> "Sunday";
                    default -> throw new IllegalArgumentException("UPS");
                }
        );
    }
}
