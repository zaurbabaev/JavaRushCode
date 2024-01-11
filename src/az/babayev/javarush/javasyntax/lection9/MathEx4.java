package az.babayev.javarush.javasyntax.lection9;

import java.util.Map;
import java.util.TreeMap;

public class MathEx4 {
    public static int randomInARange(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < 100; i++) {
            Integer randomNumber = randomInARange(-10, 10);

            if (!map.containsKey(randomNumber)) {
                map.put(randomNumber, 1);
            } else {
                map.put(randomNumber, map.get(randomNumber) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.printf("%d=[%d]%n", entry.getKey(), entry.getValue());
        }

    }
}
