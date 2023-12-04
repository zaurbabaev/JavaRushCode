package az.babayev.javarush.javasyntax.lection7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


/*
Ввод списка целых чисел с клавиатуры
 */
public class ArrayListDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (!s.isEmpty()) {
                list.add(Integer.parseInt(s));
            } else {
                break;
            }
        }
        System.out.println(list);
    }
}

