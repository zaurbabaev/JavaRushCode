package az.babayev.javarush.javasyntax.lection19.lambda.example1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Timer implements Runnable {

    @Override
    public void run() {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
    }
}
