package az.babayev.javarush.javasyntax.lection18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put("4","four");
        map.put("5","five");
        map.put("6","six");
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
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        }
    }
}
