package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype;

public class SwitchExample {
    public static void main(String[] args) {
        System.out.println(getMonthByIndex(12));
        System.out.println(getMonthByIndex(1));
        System.out.println(getMonthByIndex(10));
    }

    public static String getMonthByIndex(int monthIndex) {
        return switch (monthIndex) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "NOT_FOUND";
        };
    }
}
