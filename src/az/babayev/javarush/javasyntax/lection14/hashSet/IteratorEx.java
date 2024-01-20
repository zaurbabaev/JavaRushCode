package az.babayev.javarush.javasyntax.lection14.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>() {
            {
                add("Привет");
                add("Hello");
                add("Hola");
                add("Bonjur");
                add("Cialo");
                add("Namaste");
            }
        };

        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.print(str + "\t");
        }
        System.out.println();

        for (String string : hashSet) {
            System.out.print(string + "\t");
        }

        System.out.println();

        hashSet.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        hashSet.forEach(System.out::print);

        System.out.println();
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.contains("Hola")) {
                iterator.remove();
            }
        }
        System.out.println(hashSet);

        hashSet.removeIf(str -> str.contains("Hello"));
        System.out.println(hashSet);

        HashSet<String> setCopy = new HashSet<>(hashSet);
        for (String string : setCopy) {
            if (string.contains("Namaste")) {
                hashSet.remove(string);
            }
        }
        System.out.println(hashSet);


    }
}
