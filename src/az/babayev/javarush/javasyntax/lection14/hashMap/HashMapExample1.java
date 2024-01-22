package az.babayev.javarush.javasyntax.lection14.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>() {
            {
                put("Anton", 20);
                put("Misha", 30);
                put("Yusif", null);
                put("Kanan", 25);
            }
        };

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("-".repeat(30));

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "  " + value);
        }
    }
}
