package az.babayev.javarush.javasyntax.lection14.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "My name is Earl";
        String str3 = "I love Java";
        String str4 = "I live in Moscow";
        LinkedList<String> earlBio = new LinkedList<>(List.of(str1, str2, str3, str4));
        System.out.println(earlBio);
    }
}
