package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
 */
public class Task6_03 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            numberList.add(strings.get(i).length());
        }

        int min = Integer.MAX_VALUE;

        for (String string : strings) {
            if (string.length() < min) {
                min = string.length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (numberList.get(i) == min) {
                System.out.println(strings.get(i));
            }
        }

    }

}
