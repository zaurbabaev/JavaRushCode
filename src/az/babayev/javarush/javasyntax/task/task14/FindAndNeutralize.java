package az.babayev.javarush.javasyntax.task.task14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
В классе FindAndNeutralize объявлены методы, которые тебе нужно
реализовать следующим образом:

removeBugWithFor(ArrayList<String>) - должен удалить строку
из списка, если она содержит слово bug, используя цикл for и счетчик.
removeBugWithWhile(ArrayList<String>) - должен удалить строку
из списка, если она содержит слово bug, используя цикл while и метод iterator().
removeBugWithCopy(ArrayList<String>) - должен удалить строку
из списка, если она содержит слово bug, используя цикл for-each и копию списка.
В слове bug может быть разный регистр букв (BUg, BuG, и т.д.).
Метод main реализован для вашего кода и не участвует в проверке.
 */
public class FindAndNeutralize {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("Hello world!",
                "Amigo", "Elly", "Kerry", "Bug", "bug", "Easy ug", "Risha"));

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("bug")) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equalsIgnoreCase("bug")) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> copy = new ArrayList<>(list);
        for (String string : copy) {
            if (string.equalsIgnoreCase("bug")) {
                list.remove(string);
            }
        }
    }
}
