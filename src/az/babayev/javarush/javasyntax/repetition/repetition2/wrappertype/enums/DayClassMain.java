package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums;

public class DayClassMain {
    public static void main(String[] args) {
        DayClass sunday = DayClass.SUNDAY;
        System.out.println(sunday);

        int ordinal = DayClass.SATURDAY.ordinal();
        System.out.println(ordinal);

        DayClass[] values = DayClass.values();

        for (DayClass value : values) {
            System.out.println(value);
        }

    }
}
