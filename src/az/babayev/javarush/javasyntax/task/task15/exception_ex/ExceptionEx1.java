package az.babayev.javarush.javasyntax.task.task15.exception_ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Программа считывает с консоли номер, находит в журнале соответствующего студента
 и вызывает его отвечать.
Но есть проблема: если в журнале нет студента с нужным номером, программа
завершается с исключением ArrayIndexOutOfBoundsException.
Оберни одну строку в try-catch, чтобы программа продолжала работать.
В блоке catch выведи в консоли сообщение "Студента с таким номером не существует".
 */
public class ExceptionEx1 {
    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур Мясной"
            , "Пенелопа Сиволап"
            , "Орест Злобин"
            , "Ирида Продувалова"
            , "Гектор Гадюкин"
            , "Электра Чемоданова"
            , "Гвидон Недумов"
            , "Роксана Борисенко"
            , "Юлиан Мумбриков"
            , "Зигфрид Горемыкин");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(EXIT)) {
                break;
            }
            int studentId = Integer.parseInt(input);
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
