package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное -
утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
 */
public class Task12_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }
        ArrayList<String> resultStrings = new ArrayList<>(strings);

        for (int i = 0; i < resultStrings.size(); i++) {
            int length = resultStrings.get(i).length();
            if (length % 2 == 0) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(resultStrings.get(i) + " ");
                }
                System.out.println();
            } else {
                for (int i1 = 0; i1 < 3; i1++) {
                    System.out.print(resultStrings.get(i) + " ");
                }
            }

        }
    }
}
