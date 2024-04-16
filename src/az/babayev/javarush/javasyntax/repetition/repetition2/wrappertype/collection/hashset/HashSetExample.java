package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};

        Set<String> strings = arrayToHashSet(array);
        System.out.println(strings);

    }

    public static HashSet<String> arrayToHashSet(String[] array) {
        return new HashSet<>(Arrays.asList(array));

    }
}
