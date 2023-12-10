package az.babayev.javarush.javasyntax.lection16;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("How are you");
        list.add("Amigo");
        System.out.println(list);
//        for (String s : list) {
//            System.out.println(s);
//        }
        System.out.println("-".repeat(30));
        list.add(1,"!!!");
        System.out.println(list);
        System.out.println("-".repeat(30));
        
    }


}
