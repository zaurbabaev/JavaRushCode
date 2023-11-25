package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры целое число. Вывести на экран его строку-описание
следующего вида:
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.

Пример для числа 100:
положительное четное число

Пример для числа -51:
отрицательное нечетное число
 */
public class Task7_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        int number = Integer.parseInt(string);
        if (number > 0 && number % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("положительное нечетное число");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        } else {
            System.out.println("ноль");
        }
    }
}
