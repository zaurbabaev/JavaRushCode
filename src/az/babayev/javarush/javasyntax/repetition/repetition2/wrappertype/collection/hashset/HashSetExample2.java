package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.hashset;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class HashSetExample2 {

    public static Set<String> words = new HashSet<>(
            asList("Если бы меня попросили выбрать язык на замену Java я бы не выбрал.".split(" "))
    );

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }


    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.format(" Слово %s есть в множестве \n", word);
        } else {
            System.out.format(" Слово %s нет в множестве \n", word);

        }
    }
}
