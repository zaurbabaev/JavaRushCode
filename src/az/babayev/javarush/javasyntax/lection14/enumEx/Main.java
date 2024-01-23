package az.babayev.javarush.javasyntax.lection14.enumEx;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        System.out.println(monday);
        Day[] values = Day.values();
        System.out.println(Arrays.toString(values));
        System.out.println(values[2]);
        int ordinal = Day.THURSDAY.ordinal();
        System.out.println(ordinal);

        String string = Day.SATURADAY.toString();
        System.out.println(string);
        Day sunday = Day.valueOf("SUNDAY");
        System.out.println(sunday);
        int ordinal1 = Day.WEDNESDAY.ordinal();
        System.out.println(ordinal1);
        Day value = Day.values()[ordinal1];
        System.out.println(value);

        List<Day> lIst = Day.asList();
        System.out.println(lIst);

        DayClass dayClass=DayClass.FRIDAY;
        System.out.println(dayClass);

        int ordinal2 = DayClass.SUNDAY.ordinal();
        System.out.println(ordinal2);




    }
}
