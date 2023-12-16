package az.babayev.javarush.javasyntax.task.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.
 */
public class Task11_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] words = string.split(" +");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
            }
        }
        System.out.println();
        System.out.println("-".repeat(30));

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[0] = Character.toUpperCase(chars[0]);
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        System.out.println(chars);


    }
}
