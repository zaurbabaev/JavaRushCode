package az.babayev.javarush.javasyntax.lection19.lambda.example1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendar implements Runnable {
    @Override
    public void run() {
        var date = LocalDate.now();
        System.out.printf("Həftənin %s günüdür %n", date.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, new Locale("az")));
    }
}
