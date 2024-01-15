package az.babayev.javarush.javasyntax.task.task11;

import java.util.Calendar;

/*
В классе Solution есть поле currentYear, которое должно инициализироваться
значением текущего года(Calendar.getInstance().get(Calendar.YEAR))
 при создании нового объекта типа CurrentYear.
Тебе нужно найти ошибку и исправить её, чтобы при создании объекта
класса CurrentYear поле currentYear правильно инициализировалось.
 */
public class CurrentYear {
    private final int currentYear;

    public CurrentYear() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        CurrentYear currentYear = new CurrentYear();
        System.out.println(currentYear.getCurrentYear());
    }
}
