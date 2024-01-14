package az.babayev.javarush.javasyntax.lection10;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String path = "Good news everyone!";
        String[] split = path.split("ne");
        System.out.println(Arrays.toString(split));


        StringTokenizer tokenizer = new StringTokenizer(path, "ne");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        String name = "Amigo";
        String surname = "Rush";
        String format = String.format("name %s, surname %s", name, surname);
        System.out.println(format);

        int a = 12;
        int b = 10;
        int c = 13;

        String format1 = String.format("a=%2$d, b=%3$d, c=%1$d", a, b, c);
        System.out.println(format1);

        String x = "Hello";
        String y = "Hello";
        String z = "ok";
        String[] pool = {"Hello", "ok"};
        x = pool[0];
        y = pool[0];
        z = pool[1];
    }
}
