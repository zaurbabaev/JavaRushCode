package az.babayev.javarush.javasyntax.lection13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GenericEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> list;
        list = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };

        HashMap<Integer, String> map = new HashMap<>() {
            {
                put(1, "hello");
                put(2, "Java");
                put(3, "Amigo");
            }
        };


        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }

        System.out.println();
        ArrayList<String> listHello = new ArrayList<>() {
            {
                add("Привет");
                add("Hi");
            }
        };

        ArrayList<String> listBye = new ArrayList<>() {
            {
                add("Пока");
                add("Good bye");
            }
        };

        ArrayList<ArrayList<String>> lists = new ArrayList<>() {
            {
                add(listHello);
                add(listBye);
            }
        };

        lists.forEach(s -> System.out.print(s + " "));

    }


}
