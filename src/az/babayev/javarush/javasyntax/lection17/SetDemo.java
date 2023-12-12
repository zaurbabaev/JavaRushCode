package az.babayev.javarush.javasyntax.lection17;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static  void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Hello");
        set.add("poka");
        set.add("Hello");
        set.add("Hello");
        System.out.println(set);
        boolean contains = set.contains("Hello");
        System.out.println(contains);
        set.remove("Hello");
        System.out.println(set);

    }
}
