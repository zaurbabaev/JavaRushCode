package az.babayev.javarush.javasyntax.task.task14.enumEx2;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JUNE));
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println("-".repeat(30));
        System.out.println(getNextMonth2(Month.JUNE));
        System.out.println(getNextMonth2(Month.DECEMBER));
        System.out.println("-".repeat(30));
        System.out.println(getNextMonth3(Month.JUNE));
        System.out.println(getNextMonth3(Month.DECEMBER));
    }

    private static Month getNextMonth(Month month) {
        int ordinal = month.ordinal();
        Month[] values = Month.values();
        if (ordinal == Month.values().length - 1) {
            return values[0];
        }
        return Month.values()[ordinal + 1];
    }

    // 2ci usul
    public static Month getNextMonth2(Month month) {
        int ordinal = month.ordinal();
        Month[] values = Month.values();
        if (ordinal == values.length - 1) {
            return values[0];
        }
        return values[ordinal + 1];
    }

    // 3cu usul
    public static Month getNextMonth3(Month month) {
        int ordinal = month.ordinal();
        if (ordinal == Month.DECEMBER.ordinal()) {
            return Month.values()[0];
        }
        return Month.values()[ordinal + 1];
    }

}

