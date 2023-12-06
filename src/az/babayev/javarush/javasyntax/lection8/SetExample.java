package az.babayev.javarush.javasyntax.lection8;

import javax.xml.transform.Source;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        // iterator vasitəsilə
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // forEach vasitəsilə
        for (String s : set) {
            System.out.println(s);
        }
    }
}
