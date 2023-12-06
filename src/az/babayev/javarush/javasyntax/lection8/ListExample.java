package az.babayev.javarush.javasyntax.lection8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        // iterator vasitəsilə
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // forEach vasitəsilə
        for (String s : list) {
            System.out.println(s);
        }

    }
}
