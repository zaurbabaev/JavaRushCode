package az.babayev.javarush.javasyntax.task.task19.task1814;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
Метод getDistinct(ArrayList<String>) получает список слов, в котором
содержатся повторы. Твоя задача — реализовать этот метод так, чтобы он
возвращал поток слов без повторов (каждое слово — по одному разу).
В этом тебе поможет метод distinct() объекта типа Stream<String>.

Метод main() не принимает участие в тестировании.
 */
public class Solution {
    public static void main(String[] args) {
        var words = new ArrayList<String>(List.of(
                "чтобы", "стать", "программистом", "нужно", "программировать",
                "а", "чтобы", "программировать", "нужно", "учиться"
        ));

        Stream<String> distinctWords = getDistinctWords(words);
        distinctWords.forEach(System.out::println);

    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {
        return words.stream().distinct();
    }
}
