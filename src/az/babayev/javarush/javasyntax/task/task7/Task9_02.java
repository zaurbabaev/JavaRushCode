package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка,
и выведи оставшиеся элементы в обратном порядке.
 */
public class Task9_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == 2) {
                list.remove(2);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(list.size() - i - 1);
            System.out.println(s);
        }
    }
}
