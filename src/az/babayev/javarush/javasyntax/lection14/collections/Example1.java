package az.babayev.javarush.javasyntax.lection14.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";
        String saturn = "Сатурн";
        String uranus = "Уран";
        String neptune = "Нептун";

        List<String> solarSystem = new ArrayList<>(List.of(
                mercury, venus, earth, mars, jupiter, saturn, uranus, neptune));
        System.out.println(solarSystem);
        solarSystem.add("sda");
        System.out.println(solarSystem);

        Collections.sort(solarSystem);
        System.out.println(solarSystem);

        Collections.reverse(solarSystem);
        System.out.println(solarSystem);

    }
}
