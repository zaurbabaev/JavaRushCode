package az.babayev.javarush.javasyntax.task.task03;
/*
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sYear = bufferedReader.readLine();
        int year = Integer.parseInt(sYear);
        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!\n", name, year);
        System.out.println(name+" захватит мир через "+year+ " лет. Му-ха-ха!");
    }
}
