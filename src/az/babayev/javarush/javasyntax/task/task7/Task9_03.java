package az.babayev.javarush.javasyntax.task.task7;

import java.util.ArrayList;

/*
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
 */
public class Task9_03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size(); i += 2) {
            list.add(i + 1, "именно");
        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}
