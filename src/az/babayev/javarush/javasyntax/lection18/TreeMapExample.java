package az.babayev.javarush.javasyntax.lection18;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "one");
        treeMap.put("2", "two");
        treeMap.put("3", "three");
        treeMap.put("4", "four");
        treeMap.put("5", "five");
        treeMap.put("6", "six");
        treeMap.put("7", "seven");


        Comparator<Person> comparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().length() - o2.getName().length();

            }
        };

        Map<Person, Integer> map = new TreeMap<>(comparator);
        map.put(new Person("Mike", 123456), 40);
        map.put(new Person("Sasha", 123566), 30);
        map.put(new Person("Yura", 433456), 48);
        map.put(new Person("Mariya", 542246), 20);
        map.put(new Person("Nata", 123456), 30);
        System.out.println(map);



    }
}
