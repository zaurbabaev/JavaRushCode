package az.babayev.javarush.javasyntax.lection9;

import java.util.concurrent.TimeUnit;

public class TimeUnitEx {
    public static void main(String[] args) throws InterruptedException {
        TimeUnit.DAYS.sleep(1);
        TimeUnit.HOURS.sleep(2);
        TimeUnit.MINUTES.sleep(5);
        TimeUnit.SECONDS.sleep(30);
        TimeUnit.MILLISECONDS.sleep(40);
        TimeUnit.MICROSECONDS.sleep(3);
        TimeUnit.NANOSECONDS.sleep(90);
    }
}
