package az.babayev.javarush.javacore.task.task5.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }


    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String input = reader.readLine();
            thePlanet = switch (input) {
                case Planet.SUN -> Sun.getInstance();
                case Planet.MOON -> Moon.getInstance();
                case Planet.EARTH -> Earth.getInstance();
                default -> null;
            };

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
