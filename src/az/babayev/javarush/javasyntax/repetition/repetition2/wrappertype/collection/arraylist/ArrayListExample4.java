package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample4 {
    public static List<String> planets = new ArrayList<>();

    private static void addPlanets() {
        Collections.addAll(planets, "Mercury", "Venera", "Earth",
                "Mars", "Jupiter", "Saturn", "Uran", "Neptune");
    }

    public static void createNewPlanet(String name){
        int earthIndex = planets.indexOf("Earth");
        planets.add(earthIndex+1,name);
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.format("%s - I am - %d planet from the sun \n", planets.get(i), i+1);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("New planet");
        print();
    }
}
