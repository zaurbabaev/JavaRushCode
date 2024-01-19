package az.babayev.javarush.javasyntax.task.task14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
В классе Solution есть метод print(HashSet<String>),
который должен выводить в консоли все элементы множества, используя iterator().
Метод main не участвует в проверке.
 */
public class IteratorEx {

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }

    private static void print(HashSet<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
