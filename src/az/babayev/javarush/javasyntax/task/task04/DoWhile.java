package az.babayev.javarush.javasyntax.task.task04;

import java.util.Scanner;

/*
В этой задаче нужно:

Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
Пример ввода:
абв
2

Пример вывода:
абв
абв
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        int number = console.nextInt();
        int i = 0;
        do {
            System.out.println(line);
            i++;
        }
        while (i < number && number < 5);
    }

}

