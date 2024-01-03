package az.babayev.javarush.javasyntax.task.task6;

import java.util.Scanner;

/*
В этой задаче тебе нужно:

Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null
(null должны быть не строками "null").
Примеры.

Массив после чтения строк:
{"Hello", "Hello", "World", "Java", "Tasks", "World"}
Массив после удаления повторяющихся строк:
{null, null, null, "Java", "Tasks", null}
 */
public class EqualStrings {
    public static String[] strings;

    public static void main(String[] args) {

        strings = new String[6];
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < strings.length; i++) {
            String string = console.nextLine();
            strings[i] = string;
        }

        String check;
        for (int i = 0; i < strings.length; i++) {
            check = strings[i];
            if (check != null) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (check.equals(strings[j])) {
                        strings[i] = null;
                        strings[j] = null;
                    }
                }
            }

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }


    }
}