package az.babayev.javarush.javasyntax.task.task02;

import java.util.Scanner;

/*
Считай с клавиатуры три строки.
А затем:

Выведи на экран третью строку в неизменном виде.
Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
Пример ввода:

Строка Номер РАЗ
Вторая строка
Строка 3
Пример вывода:

Строка 3
ВТОРАЯ СТРОКА
строка номер раз
 */
public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        System.out.println(third);
        System.out.println(second.toUpperCase());
        System.out.println(first.toLowerCase());
    }
}
