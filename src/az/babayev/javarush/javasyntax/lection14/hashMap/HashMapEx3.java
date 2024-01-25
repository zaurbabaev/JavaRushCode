package az.babayev.javarush.javasyntax.lection14.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx3 {
    public static void main(String[] args) {
       Map<Integer, String> passportsAndNames = new HashMap<>(Map.of(
               212133, "Лидия Аркадьевна Бубликова",
               162348, "Иван Михайлович Серебряков",
               8082771, "Дональд Джон Трамп"
       ));
        Map<Integer, String> passportsAndNames2 = new HashMap<>(Map.of(
                917352, "Алексей Андреевич Ермаков",
                925648, "Максим Олегович Архаров"
        ));

        passportsAndNames.putAll(passportsAndNames2);
        System.out.println(passportsAndNames);
        System.out.println("-".repeat(60));

        passportsAndNames.entrySet().forEach(System.out::println);


    }
}
