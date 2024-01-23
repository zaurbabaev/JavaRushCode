package az.babayev.javarush.javasyntax.lection14.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";
        String saturn = "Сатурн";
        String uranus = "Уран";
        String neptune = "Нептун";
        //Exception in thread "main" java.lang.UnsupportedOperationException  deyisilmez list
        List<String> solarySystem = Collections.unmodifiableList(new ArrayList<>(
                List.of(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune)));
        solarySystem.add("new");
        System.out.println(solarySystem);


    }
}
