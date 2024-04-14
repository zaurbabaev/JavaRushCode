package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public static List<Day> asList() {
        List<Day> list = new ArrayList<>();
        Collections.addAll(list, values());
        return list;

    }

}
