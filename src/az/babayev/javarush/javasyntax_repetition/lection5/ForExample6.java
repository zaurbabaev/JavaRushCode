package az.babayev.javarush.javasyntax_repetition.lection5;

import java.util.Scanner;

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу,
в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.

Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
 */
public class ForExample6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        float sum = scanner.nextFloat();
        System.out.println("Введите срок вклада в месяцах:");
        int period = scanner.nextInt();
        for (int i = 1; i <= period; i++) {
            sum += (float) (sum * 0.07);
        }
        System.out.printf("После %d месяцев сумма вклада составит %f\n", period, sum);
        scanner.close();
    }
}
