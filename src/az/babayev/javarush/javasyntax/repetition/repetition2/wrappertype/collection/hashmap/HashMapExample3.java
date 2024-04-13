package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.hashmap;

import java.util.*;

public class HashMapExample3 {
    public static Map<Integer, String> getProgrammingLanguages() {
        Map<Integer, String> hashMap = new HashMap<>();
        List<String> programmingLanguages = new ArrayList<>();
        Collections.addAll(programmingLanguages, "Java", "Kotlin", "Go", "Javascript", "Typescript",
                "Python", "PHP", "C++;");
        for (int i = 0; i < programmingLanguages.size(); i++) {
            hashMap.put(i, programmingLanguages.get(i));
        }
        return hashMap;
    }

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }
}
