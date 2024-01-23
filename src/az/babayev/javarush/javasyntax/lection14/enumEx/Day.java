package az.babayev.javarush.javasyntax.lection14.enumEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURADAY,
    SUNDAY;

    public static List<Day> asList() {
        ArrayList<Day> list = new ArrayList<>();
        Collections.addAll(list, values());
        return list;
    }
}
