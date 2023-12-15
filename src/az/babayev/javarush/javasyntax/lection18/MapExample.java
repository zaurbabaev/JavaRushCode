package az.babayev.javarush.javasyntax.lection18;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        boolean containsKey = map.containsKey("6");
        System.out.println(containsKey);
        boolean containsValue = map.containsValue("five");
        System.out.println(containsValue);
        Collection<String> values = map.values();
        System.out.println(values);

        String remove = map.remove("6");
        System.out.println(remove);
        System.out.println(map);

        int size = map.size();
        System.out.println(size);

        Set<String> strings = map.keySet();
        System.out.println(strings);

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }
        System.out.println("-".repeat(30));
        List<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);
        List<String> valueList = new ArrayList<>(map.values());
        System.out.println(valueList);
        System.out.println("-".repeat(30));

        map.forEach((key, value) -> System.out.println(key + "----" + value));
        System.out.println("-".repeat(30));

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"---"+next.getValue());
        }
        System.out.println("-".repeat(30));

    }
}
