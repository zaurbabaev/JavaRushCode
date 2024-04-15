package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.exception.student;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentJournal {
    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает %s \n";
    public static final String NOT_EXIST = "Студента с таким номером не существует";
    public static final String INTEGER_REQUIRED = "Нужно ввести целое число ";

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

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print(PROMPT_STRING);
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase(EXIT)) {
                    break;
                }
                try {
                    int studentId = Integer.parseInt(input);
                    System.out.format(ANSWERING, studentsJournal.get(studentId));
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(NOT_EXIST);
                } catch (NumberFormatException e) {
                    System.out.println(INTEGER_REQUIRED);
                }
            }
        }
    }

}
