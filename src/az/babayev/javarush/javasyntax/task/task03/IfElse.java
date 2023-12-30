package az.babayev.javarush.javasyntax.task.task03;

import java.util.Scanner;

/*
Ввести с клавиатуры температуру на улице. Если температура меньше 0,
вывести надпись "на улице холодно",
иначе - вывести надпись "на улице тепло".
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        if (temperature <= 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }

    }
}
