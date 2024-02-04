package az.babayev.javarush.javasyntax.task.task17.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
Проинициализируй переменную birthDate объектом GregorianCalendar с датой
своего рождения. Реализуй метод getDayOfWeek(Calendar calendar), чтобы он
возвращал русское название дня недели аргумента calendar.
Помни, что в григорианском календаре неделя начинается с воскресенья.
 */
public class DayOfWeek {
    static Calendar birthDate = new GregorianCalendar(1987, Calendar.MARCH, 1);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
//        SimpleDateFormat format = new SimpleDateFormat("EEEE", new Locale("ru", "RU"));
//        String message = format.format(birthDate.getTime());
//        System.out.println(message);

    }

    static String getDayOfWeek(Calendar calendar) {
//        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//        return switch (dayOfWeek) {
//            case 1 -> "воскресенье";
//            case 2 -> "Понедельник";
//            case 3 -> "вторник";
//            case 4 -> "среда";
//            case 5 -> "четверг";
//            case 6 -> "пятница";
//            case 7 -> "суббота";
//            default -> "введите правильное значение";
//        };
        return new SimpleDateFormat("EEEE", new Locale("ru", "RU"))
                .format(calendar.getTime());
    }
}
