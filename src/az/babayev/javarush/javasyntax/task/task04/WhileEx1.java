package az.babayev.javarush.javasyntax.task.task04;

import java.util.Scanner;

/*
Ввести с клавиатуры имя и, используя цикл while,
10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки.
Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
 */
public class WhileEx1 {
    public static void main(String[] args) {
        String text = " любит меня";
        Scanner console = new Scanner(System.in);
        int i = 0;
        String name = console.nextLine();
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
    }
}
