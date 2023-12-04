package az.babayev.javarush.javasyntax.task.task7;
/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран.
Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task9_01 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> x3 = new ArrayList<>();
        ArrayList<Integer> x2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            String string = reader.readLine();
            int anInt = Integer.parseInt(string);
            numbers.add(anInt);
        }


        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number % 3 == 0) {
                x3.add(number);
            }
            if (number % 2 == 0) {
                x2.add(number);
            }
            if (!(number % 3 == 0 || number % 2 == 0)) {
                other.add(number);
            }
        }
        printList(numbers);
        printList(x3);
        printList(x2);
        printList(other);
    }

//    public static void printList(ArrayList<Integer> list) {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }

    public static void printList(ArrayList<Integer> list) {
        System.out.println(list);
    }
}
