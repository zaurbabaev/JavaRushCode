package az.babayev.javarush.javasyntax.task.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.
 */
public class Task11_09_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> months = new ArrayList<>();
        Collections.addAll(months, "January", "February", "March", "April", "May", "June", "July"
                , "August", "September", "October", "November", "December");
        String month = reader.readLine();
        if (months.contains(month)) {
            int monthNumber = months.indexOf(month) + 1;
            System.out.println(month + " is the " + monthNumber + " month");
        } else {
            System.out.println(month + " isn't a month");
        }
    }
}
