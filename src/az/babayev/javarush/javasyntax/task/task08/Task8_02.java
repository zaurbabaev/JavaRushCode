package az.babayev.javarush.javasyntax.task.task08;

import java.util.HashSet;
import java.util.Set;

/*
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
 */
public class Task8_02 {
    public static Set<Integer> createSet() {
        Set<Integer> integers = new HashSet<>();
        while (integers.size() < 20) {
            int n = (int) (Math.random() * 100);
            integers.add(n);
        }
        return integers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(integer -> integer > 10);
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> integers = removeAllNumbersGreaterThan10(createSet());
        System.out.println(integers);
    }
}
