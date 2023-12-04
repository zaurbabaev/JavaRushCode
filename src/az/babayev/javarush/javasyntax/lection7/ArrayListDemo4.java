package az.babayev.javarush.javasyntax.lection7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удаление всех чисел больше 5
 */
public class ArrayListDemo4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(3);
        list.add(15);

        int i = 0;
        while (i < list.size()) {
            if (list.get(i) > 5) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(list);

    }
}
