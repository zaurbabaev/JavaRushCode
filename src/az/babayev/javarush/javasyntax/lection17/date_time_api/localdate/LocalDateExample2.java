package az.babayev.javarush.javasyntax.lection17.date_time_api.localdate;

import java.time.LocalDate;

public class LocalDateExample2 {
    public static void main(String[] args) {
        // Local date immutable-dir
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date -> " + currentDate);
        LocalDate plus2Days = currentDate.plusDays(2);
        System.out.println("Plus 2 Days -> " + plus2Days);
        LocalDate plus3Months = currentDate.plusMonths(3);
        System.out.println("Plus 3 Months -> " + plus3Months);
        LocalDate plus6Weeks = currentDate.plusWeeks(6);
        System.out.println("Plus 6 Weeks -> " + plus6Weeks);
        LocalDate plus7Years = currentDate.plusYears(7);
        System.out.println("Plus 7 Years ->" + plus7Years);
        System.out.println("-".repeat(30));
        LocalDate currentDate2 = LocalDate.now();
        System.out.println("Current date -> " + currentDate);
        LocalDate minus2Days = currentDate.minusDays(2);
        System.out.println("Minus 2 Days -> " + minus2Days);
        LocalDate minus3Months = currentDate.minusMonths(3);
        System.out.println("Minus 3 Months -> " + minus3Months);
        LocalDate minus6Weeks = currentDate.minusWeeks(6);
        System.out.println("Minus 6 Weeks -> " + minus6Weeks);
        LocalDate minus7Years = currentDate.minusYears(7);
        System.out.println("Minus 7 Years ->" + minus7Years);

    }
}
