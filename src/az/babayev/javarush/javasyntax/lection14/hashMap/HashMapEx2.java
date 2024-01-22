package az.babayev.javarush.javasyntax.lection14.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(Map.of(0, "Hi",
                1, "Hello",
                2, "Bye bye"));
        String string = hashMap.get(0);
        hashMap.put(0, string + "!");
        for (String value : hashMap.values()) {
            System.out.println(value);
        }
    }
}
