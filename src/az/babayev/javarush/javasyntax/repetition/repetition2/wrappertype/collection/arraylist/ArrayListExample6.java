package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample6 {
    public static void removeBugWithFor(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if ("bug".equalsIgnoreCase(strings.get(i))) {
                strings.remove(i);
                i--;
            }
        }

    }

    public static void removeBugWithWhile(ArrayList<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if ("bug".equalsIgnoreCase(word)) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> strings) {
        ArrayList<String> copy = new ArrayList<>(strings);
        for (String s : copy) {
            if ("bug".equalsIgnoreCase(s)) {
                strings.remove(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of(
                "Hello world", "Amigo", "Elly", "Kerry", "BUG", "bug", "Easy ug", "Risha"
        ));

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        String line="______________________";
        System.out.println(line);
        copyWordsFirst.forEach(System.out::println);
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
    }
}
