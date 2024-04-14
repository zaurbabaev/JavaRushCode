package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums;

import java.util.List;

public class EnumMain {
    public static void main(String[] args) {
        Day friday = Day.FRIDAY;
        System.out.println(friday);

        int ordinal = Day.FRIDAY.ordinal();
        System.out.println(ordinal);

        Day[] values = Day.values();
        for (Day value : values) {
            System.out.print(value+" ");
        }
        System.out.println();

        System.out.println(values[3]);

        Day friday1 = Day.valueOf("FRIDAY");
        System.out.println(friday1);

        String string = Day.MONDAY.toString();
        System.out.println(string);

        Day monday = Day.valueOf("MONDAY");
        System.out.println(monday);

        Day value = Day.values()[3];
        System.out.println(value);

        List<Day> list = Day.asList();

        System.out.println(list);


    }
}
