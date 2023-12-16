package az.babayev.javarush.javasyntax.task.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.
 */
public class Task11_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthName = reader.readLine();
        try {
            Date month = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse(monthName);
            System.out.println(monthName + " is the " + (month.getMonth() + 1) + " month");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
