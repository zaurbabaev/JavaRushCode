package az.babayev.javarush.javasyntax.lection17;

import java.util.*;

public class TextProcessor {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer(Data.TEXT, "\n 1234567890,.:;-()!?—«»");
        List<String> strings = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            strings.add(tokenizer.nextToken());
        }
        strings.removeIf(s -> s.equals("это"));

        Set<String> uniqueWords = new TreeSet<>(Comparator.reverseOrder());
        uniqueWords.addAll(strings);
        System.out.println(uniqueWords);

        System.out.printf("List size = %d, set size = %d %n", strings.size(), uniqueWords.size());

        Deque<String> reversedOrderWords = new ArrayDeque<>();
        for (String uniqueWord : uniqueWords) {
            reversedOrderWords.addFirst(uniqueWord);
        }

        System.out.println(reversedOrderWords);

    }
}
