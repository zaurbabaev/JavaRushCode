package az.babayev.javarush.javasyntax.task.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и
количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1
 */
public class Task7_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int sumPositiveNum = 0;
        int sumNegativeNum = 0;
        while (i < 3) {
            int number1 = Integer.parseInt(bufferedReader.readLine());
            if (number1 <= -1) {
                sumNegativeNum++;
            } else if (number1 > 1) {
                sumPositiveNum++;
            }
            i++;
        }
        System.out.println("Kоличество отрицательных чисел: " + sumNegativeNum);
        System.out.println("Kоличество положительных чисел: " + sumPositiveNum);
    }

}
