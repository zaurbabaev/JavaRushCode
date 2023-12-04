package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента,
нарушающего такую упорядоченность.
 */
public class Task9_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).length() > list.get(i).length()) {
                System.out.println(i);
                break;
            }
        }
    }
}
