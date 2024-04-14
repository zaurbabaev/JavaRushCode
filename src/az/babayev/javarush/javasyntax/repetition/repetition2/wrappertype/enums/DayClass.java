package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums;

public class DayClass {
    private int value;


    public static final DayClass MONDAY = new DayClass(0);
    public static final DayClass TUESDAY = new DayClass(1);
    public static final DayClass WEDNESDAY = new DayClass(2);
    public static final DayClass THURSDAY = new DayClass(3);
    public static final DayClass FRIDAY = new DayClass(4);
    public static final DayClass SATURDAY = new DayClass(5);
    public static final DayClass SUNDAY = new DayClass(6);


    private static final DayClass[] array = {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    };

    private DayClass(int value) {
        this.value = value;
    }

    public int ordinal() {
        return this.value;
    }

    public static DayClass [] values() {
        return array;
    }

    @Override
    public String toString() {
        return "DayClass{" +
                "value=" + value +
                '}';
    }
}
