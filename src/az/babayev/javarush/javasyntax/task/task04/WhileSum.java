package az.babayev.javarush.javasyntax.task.task04;

import java.util.Scanner;

/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.
 */
public class WhileSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while (console.hasNextInt()) {
            int number = console.nextInt();
            sum += number;
            "ENTER".equals(console.nextLine());
        }
        System.out.println(sum);
    }
}
