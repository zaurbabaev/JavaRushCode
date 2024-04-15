package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums.enum_example;

public class MonthMain {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.FEBRUARY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        int ordinal = month.ordinal();
        if (ordinal == Month.values().length - 1) {
            return Month.JANUARY;
        }
        return Month.values()[ordinal + 1];
    }


}
