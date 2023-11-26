package az.babayev.javarush.javasyntax.task.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Примеры:
а) при вводе чисел
1
2
2
4
5
-1
получим вывод
2.8

б) при вводе чисел
4
3
2
1
-1
получим вывод
2.5

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
 */
public class Task6_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double number = 0;
        double sum = 0;
        int counter = 0;
        while (true) {
            number = Double.parseDouble(bufferedReader.readLine());
            if (number == -1) {
                break;
            }
            counter++;
            sum += number;
        }
        System.out.println(sum / counter);
    }
}
