package az.babayev.javarush.javasyntax.lection9;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random r = new Random();
        double v = r.nextDouble() * 100;
        System.out.println(v);
        float v1 = r.nextFloat() * 70;
        System.out.println(v1);

        int max = 60;
        int min = 30;
        int bound = r.nextInt(max - min) + min;
        System.out.println(bound);

        int nextedInt = r.nextInt();
        System.out.println(nextedInt);
    }
}
