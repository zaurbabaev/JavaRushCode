package az.babayev.javarush.javasyntax.task.task04;
/*
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        String sNumber = bufferedReader.readLine();
        int number = Integer.parseInt(sNumber);

        if (number > 0) {
            number *= 2;
            System.out.println(number);
        } else if (number < 0) {
            number += 1;
            System.out.println(number);
        } else {
            number = 0;
            System.out.println(number);
        }

    }
}
