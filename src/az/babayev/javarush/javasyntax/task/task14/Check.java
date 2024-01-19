package az.babayev.javarush.javasyntax.task.task14;

import java.util.HashSet;

import static java.util.Arrays.asList;

/*
Вклассе Check есть метод checkWords(String),
который должен проверять наличие переданного слова в множестве words.
Если слово есть, то выводим в консоль:
Слово [переданное слово] есть в множестве
Если нет:
Слова [переданное слово] нет в множестве

Метод main не участвует в проверке.

Пример вывода:
Слово Java есть в множестве
 */
public class Check {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал"
            .split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.printf("Слова %s есть в множестве",word);
        } else {
            System.out.printf("Слова %s нет в множестве",word);
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }

}
