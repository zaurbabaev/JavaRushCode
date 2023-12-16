package az.babayev.javarush.javasyntax.task.task08;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
 */
public class Task11_08 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("FEBRUARY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        SimpleDateFormat formatter = new SimpleDateFormat("D");
        int days = Integer.parseInt(formatter.format(date1));
        return days % 2 != 0;
    }
}
