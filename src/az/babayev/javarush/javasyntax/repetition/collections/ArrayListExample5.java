package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
    public static List<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlaner("new Planet");
        print();

    }


    public static void addPlanets() {
        planets.add("Mercury");
        planets.add("Venera");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uran");
        planets.add("Neptune");
    }

    public static void createNewPlaner(String name) {
        int earthIndex = planets.indexOf("Earth");
        planets.add(earthIndex + 1, name);
    }

    public static void print() {
        planets.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
