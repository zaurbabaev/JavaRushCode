package az.babayev.javarush.javasyntax.task.task14;

import java.util.ArrayList;
import java.util.HashMap;

/*
В классе ArrayListVsHashSet есть метод getProgrammingLanguages, который возвращает
список языков программирования. Тебе нужно переписать этот метод,
чтобы он возвращал HashMap<Integer, String>. Ключом в этой коллекции будет
индекс элемента в ArrayList.
 */
public class ArrayListVsHashSet {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        for (int i = 0; i < programmingLanguages.size(); i++) {
            hashMap.put(i, programmingLanguages.get(i));
        }
        return hashMap;
    }
}
