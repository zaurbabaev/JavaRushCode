package az.babayev.javarush.javasyntax.task.task08;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу
 "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
 */
public class Task8_03 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Мельникова" + i, "Ксения" + i);
        }
        return map;

    }

    public static int getCountTheSameFirstname(Map<String, String> map, String name) {
        return Collections.frequency(map.values(), name);


    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        return Collections.frequency(map.keySet(), lastName);
    }

    public static void main(String[] args) {
        int countTheSameFirstname = getCountTheSameFirstname(createMap(), "Ксения1");
        System.out.println(countTheSameFirstname);
        int countTheSameLastName = getCountTheSameLastName(createMap(), "Мельникова3");
        System.out.println(countTheSameLastName);
    }
}
