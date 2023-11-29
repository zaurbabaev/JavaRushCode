package az.babayev.javarush.javasyntax.task.task7;

import java.util.ArrayList;

/*
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 */
public class Task4_08 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Java");
        list.add("How are you");
        list.add("Amigo");
        list.add("Tom");
        System.out.println(list.size());
        for (String string : list) {
            System.out.println(string);
        }
    }
}
