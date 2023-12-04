package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end".
Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
 */
public class Task12_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if ("end".equals(string)) {
                break;
            } else {
                list.add(string);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}
