package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и
завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 */
public class Task16_03 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number != -1) {
                summa += number;
            } else {
                summa -= 1;
                break;
            }


        }
        System.out.println(summa);
    }
}
