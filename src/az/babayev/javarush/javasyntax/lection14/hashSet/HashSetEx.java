package az.babayev.javarush.javasyntax.lection14.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx {
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
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if (hashSet.contains(str)) {
            System.out.println("Да спаткання!");
        }

    }
}
