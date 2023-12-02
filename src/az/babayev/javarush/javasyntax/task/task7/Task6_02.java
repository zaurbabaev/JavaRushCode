package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько,
 выведи каждую с новой строки.
 */
public class Task6_02 {

    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            numberList.add(strings.get(i).length());
        }

        int max = 0;

        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (numberList.get(i) == max) {
                System.out.println(strings.get(i));
            }
        }


    }


}
