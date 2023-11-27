package az.babayev.javarush.javasyntax.task.task5;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
 */
public class Task12_04 {
    public static void main(String[] args) {
        Date date = new Date();
        String formatted = new SimpleDateFormat("dd MM yyyy")
                .format(date);
        System.out.println(formatted);

    }
}
