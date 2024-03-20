package az.babayev.javarush.javasyntax.repetition;

import java.util.Map;
import java.util.TreeMap;

public class MathExample2 {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 10000; i++) {
            Integer randomNumber = randomInRange(-10, 10);
            if (!map.containsKey(randomNumber)) {
                map.put(randomNumber, 1);
            } else {
                map.put(randomNumber, map.get(randomNumber) + 1);
            }
        }

        map.forEach((key, value) -> System.out.format("%d = [%d] \n", key, value));

    }

    public static int randomInRange(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }


}
