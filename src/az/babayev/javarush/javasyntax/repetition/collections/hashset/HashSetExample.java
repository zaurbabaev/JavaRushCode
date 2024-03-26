package az.babayev.javarush.javasyntax.repetition.collections.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(Set.of(
                "Privet", "Hello", "Hola", "Bonjour", "Cialo", "Namaste"
        ));

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if(hashSet.contains(str)){
            System.out.println("Да спаткання!");
        }

    }
}
