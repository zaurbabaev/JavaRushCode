package az.babayev.javarush.javasyntax.lection19;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> firstMap = new HashMap<>();
        firstMap.put("A",1);
        firstMap.put("B",2);
        firstMap.put("C",3);
        System.out.println(firstMap);
        System.out.println("-".repeat(30));
        Map<String, Integer> secondMap = new HashMap<>();
        secondMap.put("D",4);
        secondMap.putAll(firstMap);
        System.out.println(secondMap);
    }
}
