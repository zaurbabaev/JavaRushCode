package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_switchExample {
    public static void main(String[] args) throws IOException {
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(
                "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int indexOf = solarSystem.indexOf(string);
        System.out.println(getPlanetAtmosphere(indexOf));
    }

    public static List<String> getPlanetAtmosphere(int seqNumbersFromSun) {
        List<String> result = new ArrayList<>();
        switch (seqNumbersFromSun) {
            case 1 -> Collections.addAll(result, "Нет атмосферы");
            case 2, 4 -> Collections.addAll(result, "Углекислый газ");
            case 3 -> Collections.addAll(result, "Углекислый газ", "Азот", "Кислород");
            case 5, 6 -> Collections.addAll(result, "Водород", "Гелий");
            case 7, 8 -> Collections.addAll(result, "Метан", "Водород", "Гелий");
            default -> throw new IllegalStateException("Unexpected value: " + seqNumbersFromSun);
        }
        return result;
    }
}
