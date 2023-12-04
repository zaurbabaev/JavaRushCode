package az.babayev.javarush.javasyntax.task.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.

Подсказка:
Не забудь импортировать класс: java.util.ArrayList;
 */
public class Task12_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < number.size(); i++) {
            int x = number.size() - i - 1;
            System.out.println(number.get(x));
        }
    }
}
