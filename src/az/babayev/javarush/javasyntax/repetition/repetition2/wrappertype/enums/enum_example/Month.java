package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums.enum_example;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonth() {
        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSpringMonth() {
        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonth() {
        return new Month[]{JUNE, JULY, AUGUST};
    }

    public static Month[] getAutumnMonth() {
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }

}
