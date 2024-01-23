package az.babayev.javarush.javasyntax.lection14.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";
        String saturn = "Сатурн";
        String uranus = "Уран";
        String neptune = "Нептун";
        // listləri bir biri ilə müqayisə edir 1dənədə olsa eyni element olsa fals qaytaracaq
        List<String> solarySystemPart1 = new ArrayList<>(List.of(mercury, venus, earth, mars));
        List<String> solarySystemPart2 = new ArrayList<>(List.of(jupiter, saturn, uranus, neptune));
        boolean disjoint = Collections.disjoint(solarySystemPart1, solarySystemPart2);
        System.out.println(disjoint);



    }
}
