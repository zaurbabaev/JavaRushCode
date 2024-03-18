package az.babayev.javarush.javasyntax.repetition;

import java.util.Scanner;

/*
В банке в зависимости от суммы вклада начисляемый процент по вкладу может
отличаться. Напишите консольную программу, в которую пользователь вводит
сумму вклада. Если сумма вклада меньше 100, то начисляется 5%.
Если сумма вклада от 100 до 200, то начисляется 7%.
Если сумма вклада больше 200, то начисляется 10%.
В конце программа должна выводить сумму вклада с начисленными процентами.
 */
public class IfElseExample3 {
    public static void main(String[] args) {
        float sum;
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("вводит сумму вклада: ");
            sum = console.nextFloat();
        }
        if (sum < 100) {
            sum += sum * 0.05F;
        } else if (sum <= 200) {
            sum += sum * 0.07F;
        } else sum += sum * 0.1F;
        System.out.printf("Сумму вклада после начисления процентов: %.2f \n", + sum);
    }
}
