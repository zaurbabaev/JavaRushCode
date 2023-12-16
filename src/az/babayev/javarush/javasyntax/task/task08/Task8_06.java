package az.babayev.javarush.javasyntax.task.task08;

import java.util.HashMap;
import java.util.Map;

/*
Создать словарь (Map<String, Integer>) и занести в него десять
записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
 */
public class Task8_06 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Surname1", 400);
        map.put("Surname2", 500);
        map.put("Surname3", 600);
        map.put("Surname4", 700);
        map.put("Surname5", 800);
        map.put("Surname6", 1000);
        map.put("Surname7", 300);
        map.put("Surname8", 200);
        map.put("Surname9", 100);
        map.put("Surname10", 490);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        map.entrySet().removeIf(entry -> entry.getValue() < 500);
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
        System.out.println(map);
    }
}
