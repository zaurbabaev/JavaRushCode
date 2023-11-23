package az.babayev.javarush.javasyntax.task.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.
 */
public class Task8_02 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sFirstNumber = bufferedReader.readLine();
        String sSecondNumber = bufferedReader.readLine();
        int firstNumber = Integer.parseInt(sFirstNumber);
        int secondNumber = Integer.parseInt(sSecondNumber);
        System.out.printf("%s получает %d через %d лет\n", name, firstNumber, secondNumber);
    }
}
