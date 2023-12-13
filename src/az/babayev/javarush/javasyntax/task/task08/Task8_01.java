package az.babayev.javarush.javasyntax.task.task08;

import java.util.HashSet;
import java.util.Set;

/*
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
 */
public class Task8_01 {
    public static Set<String> createSet() {
        Set<String> strings = new HashSet<>();
        strings.add("Лаборатория");
        strings.add("Лаванда");
        strings.add("Лаваш");
        strings.add("Лавочка");
        strings.add("Лавочник");
        strings.add("Лагерь");
        strings.add("Лада");
        strings.add("Ладно");
        strings.add("Лазейка");
        strings.add("Лазер");
        strings.add("Лазурь");
        strings.add("Лайк");
        strings.add("Лайнер");
        strings.add("Лайфхак");
        strings.add("Лакомка");
        strings.add("Ламинат");
        strings.add("Ламия");
        strings.add("Ландшафт");
        strings.add("Лапочка");
        strings.add("Лапушка");
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
    }
}
