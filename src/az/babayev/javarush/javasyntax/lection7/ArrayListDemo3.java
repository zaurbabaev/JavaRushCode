package az.babayev.javarush.javasyntax.lection7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 чётные числа добавляются в конец списка, нечётные — в начало.
 */
public class ArrayListDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (!s.isEmpty()) {
                int i = Integer.parseInt(s);
                if (i % 2 == 0) {
                    list.add(i);
                } else {
                    list.add(0, i);
                }
            } else {
                break;
            }
        }
        System.out.println(list);
    }
}
