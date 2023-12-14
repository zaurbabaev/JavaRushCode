package az.babayev.javarush.javasyntax.lection18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Hello", "Amigo", "How are you");
        System.out.println(strings);
        strings.add("Java");
        System.out.println(strings);
        System.out.println("-".repeat(30));
//        Collections.fill(strings,"Amigo");
//        System.out.println(strings);
        List<List<String>> lists = Collections.nCopies(3, strings);
        System.out.println(lists);
        System.out.println("-".repeat(30));
        Collections.replaceAll(strings, "Hello", "HELLO");
        System.out.println(strings);
        System.out.println("-".repeat(30));
        List<String> strings2 = new ArrayList<>();
        Collections.addAll(strings2, "Masha", "Amigo", "Pasha","Misha");
        Collections.copy(strings2, strings);
        System.out.println(strings2);
        System.out.println("-".repeat(30));



    }
}
