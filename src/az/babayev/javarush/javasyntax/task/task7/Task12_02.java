package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
 */
public class Task12_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(i < m ? i : i - m, reader.readLine());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
