package az.babayev.javarush.javasyntax.task.task17;

import java.util.BitSet;
import java.util.Date;

/*
Проинициализируй переменную birthDate объектом Date с датой своего рождения.
Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название
дня недели аргумента date.
 */
public class DateExample {
    static Date birthDate = new Date(87, 2, 1);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
        System.out.println(birthDate);
        int day = birthDate.getDay();
        System.out.println(day);
    }

    static String getDayOfWeek(Date date) {
        int day = date.getDay();
        return switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 0 -> "воскресенье";
            default -> "введите правильное значение";
        };
    }
}
