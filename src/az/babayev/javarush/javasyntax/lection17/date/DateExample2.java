package az.babayev.javarush.javasyntax.lection17.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2 {
    public static void main(String[] args) {
        Date date1 = new Date(1117876500000L);
        Date date2 = new Date();
        if (date1.getTime() < date2.getTime()) {
            System.out.println(date2);
        }

        if (date1.after(date2)) {
            System.out.println("After -> " + date2);
        }
        if (date1.before(date2)) {
            System.out.println("before -> " + date1);
        }

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String format = formatter.format(date1);
        System.out.println(format);

        Date date = new Date("06 January 2021 12:12:35"); // parsing
        System.out.println("Formatsız -> "+date);
        SimpleDateFormat format1=new SimpleDateFormat("dd MMMM yyyy");
        String format2 = format1.format(date);
        System.out.println(format2);

        date.setTime(Date.parse("12 Feb 2023 2:34:05"));
        System.out.println(date);
    }
}
