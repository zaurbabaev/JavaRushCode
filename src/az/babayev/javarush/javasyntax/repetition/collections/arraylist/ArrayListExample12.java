package az.babayev.javarush.javasyntax.repetition.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample12 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>() {
            {
                add("Hello Word");
                add("Amigo");
                add("Elly");
                add("Kerry");
                add("Bug");
                add("bug");
                add("Easy ug");
                add("Risha");
            }
        };

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        System.out.println(copyWordsFirst);
        System.out.println("-".repeat(30));
        System.out.println(copyWordsSecond);
        System.out.println("-".repeat(30));
        System.out.println(copyWordsThird);
    }

    private static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if ("bug".equalsIgnoreCase(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
    }

    private static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("bug".equalsIgnoreCase(next)) {
                iterator.remove();
            }
        }
    }

    private static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> copy = new ArrayList<>(list);
        for (String word : copy) {
            if ("bug".equalsIgnoreCase(word)) {
                list.remove(word);
            }
        }
    }
}
