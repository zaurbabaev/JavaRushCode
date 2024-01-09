package az.babayev.javarush.javasyntax.task.task09;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
В классе Timer реализуй метод setTimer(int, int, int, int, int), который засыпает на определенное время,
 используя соответствующие методы java.util.concurrent.TimeUnit.
 */
public class Timer {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
