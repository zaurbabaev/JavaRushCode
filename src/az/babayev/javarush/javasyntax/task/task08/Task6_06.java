package az.babayev.javarush.javasyntax.task.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
Искомое значение равно 3,
т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
 */
public class Task6_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        int countMax = 1;

        for (int i = 0; i < number.size() - 1; i++) {
            if (number.get(i).equals(number.get(i + 1))) {
                count++;
                if (count > countMax) {
                    countMax = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(countMax);

    }
}
