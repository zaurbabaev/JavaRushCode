package az.babayev.javarush.javasyntax.lection14.hashMap;

import java.util.*;

public class HashMapExample3 {
    public static void main(String[] args) {
        Map<Integer, String> passportsAndNames = new HashMap<>(Map.of(
                212133, "Лидия Аркадьевна Бубликова",
                162348, "Иван Михайлович Серебряков",
                8082771, "Дональд Джон Трамп"
        ));
        System.out.println(passportsAndNames);
        passportsAndNames.put(162348, "Виктор Михайлович Стычкин");
        System.out.println(passportsAndNames);
        System.out.println("-".repeat(30));
        if(!passportsAndNames.isEmpty()){
            System.out.println(passportsAndNames);
        }

        String string = passportsAndNames.get(162348);
        System.out.println(string);

        String remove = passportsAndNames.remove(162348);

        System.out.println(passportsAndNames);

        boolean key = passportsAndNames.containsKey(1111);
        System.out.println(key);

        boolean value = passportsAndNames.containsValue("Лидия Аркадьевна Бубликова");
        System.out.println(value);

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println(keys);

        List<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println(values);

        System.out.println(passportsAndNames.size());
        passportsAndNames.clear();

        System.out.println(passportsAndNames);

    }
}
