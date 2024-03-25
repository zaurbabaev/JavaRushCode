package az.babayev.javarush.javasyntax.repetition.collections.hashmap;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(Map.of(
                "Java", 17,
                "JavaRush", 24,
                "Amigo", 20,
                "Nikolay", 22,
                "Pyotr", 20
        ));

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.format("%s --> %d \n", key, value);
        }

        System.out.println("-".repeat(30));


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> pair : entries) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.format("%s -> %d \n", key, value);
        }

        System.out.println("-".repeat(30));

        entries.forEach((pair) -> {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.format("%s <-> %d \n", key, value);
        });

        //        map.forEach((key, value) -> System.out.println(key + "-" + value));

        map.forEach((key, value) -> System.out.format("%s - > %d \n", key, value));

        System.out.println("-".repeat(30));

        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<Integer> values = map.values();
        System.out.println(values);
        ArrayList<Integer> mapValues = new ArrayList<>(values);
        System.out.println(mapValues);
    }
}
