package az.babayev.javarush.javasyntax.task.task08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
Каждое слово - с новой строки.
 */
public class Task11_11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        for (String s : array) {
            isGreaterThan(s, s);
        }

    }


    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
