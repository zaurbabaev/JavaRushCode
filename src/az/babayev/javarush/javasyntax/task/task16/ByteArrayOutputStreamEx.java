package az.babayev.javarush.javasyntax.task.task16;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
В этой задаче необходимо развернуть вывод в обратном порядке с помощью PrintStream.
Метод printSomething(String) выводит в поле stream переданную строку.
Необходимо развернуть вывод в обратном порядке с помощью PrintStream.
В методе main(String[] args) считывается строка с клавиатуры и передается
в метод printSomething(String), который записывает полученную строку в поток stream.
Твоя задача — в методе main(String[]) развернуть переданную строку с помощью поля
outputStream (то есть, outputStream должен хранить в себе перевернутую строку) и
вывести в консоли.

Пример:
Входные данные:
it's a text for testing
Вывод:
gnitset rof txet a s'ti

Метод printSomething(String) не изменяй.
 */
public class ByteArrayOutputStreamEx {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSomething(new StringBuilder(scanner.nextLine()).reverse().toString());
        String result = outputStream.toString();
        System.out.println(result);

    }

    private static void printSomething(String str) {
        stream.println(str);
    }
}
