package az.babayev.javarush.javasyntax.task.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка,
например "exit", можно с помощью следующей конструкции:
 */
public class Task12_05 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;
        while (true) {
            String string = bufferedReader.readLine();
            if ("exit".equals(string)) {
                break;
            }
            summa += Integer.parseInt(string);
        }
        System.out.println(summa);
    }
}
