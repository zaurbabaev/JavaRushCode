package az.babayev.javarush.javasyntax.lection14.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";
        String saturn = "Сатурн";
        String uranus = "Уран";
        String neptune = "Нептун";
        List<String> solarySystem = new ArrayList<>(
                List.of(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune));
        System.out.println(solarySystem);
        Collections.swap(solarySystem, solarySystem.indexOf(venus), solarySystem.indexOf(uranus));
        System.out.println(solarySystem);


    }
}
