package az.babayev.javarush.javasyntax.task.task17.date_time_api.local_time;

import java.time.LocalTime;

/*
Цикл while в методе main должен отработать ровно четыре раза, чтобы на экран
вывелись 4 строки.Изменения можно вносить только в метод amazingMethod.
 */
public class LocalTimeExample2 {


    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }

    }

    static LocalTime amazingMethod(LocalTime base) {
//        return base.plusMinutes(288);
        return base.plusHours(4).plusMinutes(48);
    }

}
