package az.babayev.javarush.javasyntax.lection8;

import java.util.Collections;
import java.util.Date;

/*
Вычисление разницы между двумя датами:
 */
public class DateExample1 {
    public static void main(String[] args) throws InterruptedException {
        Date currentTime = new Date();
        Thread.sleep(3000);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println(msDelay);
    }
}
