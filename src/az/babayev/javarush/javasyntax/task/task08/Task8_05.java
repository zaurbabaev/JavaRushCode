package az.babayev.javarush.javasyntax.task.task08;

import java.util.*;

/*
Создать словарь (Map<String, String>) занести в него десять записей по
 принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
 */
public class Task8_05 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Surname1", "Name1");
        map.put("Surname2", "Name1");
        map.put("Surname3", "Name3");
        map.put("Surname4", "Name4");
        map.put("Surname5", "Name1");
        map.put("Surname6", "Name6");
        map.put("Surname7", "Name7");
        map.put("Surname8", "Name1");
        map.put("Surname9", "Name1");
        map.put("Surname10", "Name10");
        return map;
    }

    public static void removeTheFirstNameDublicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        Set<String> set = new HashSet<>();
        for (String name : copy.values()) {
            if (!set.add(name)) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDublicates(map);
        System.out.println(map);
    }
}
