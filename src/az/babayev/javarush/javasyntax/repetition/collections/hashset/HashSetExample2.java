package az.babayev.javarush.javasyntax.repetition.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>(Set.of(
                122, 32, 23, 34, 33, 31, 13, 2302
        ));

        Iterator<Integer> iterator = integers.iterator();


        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

    }
}
