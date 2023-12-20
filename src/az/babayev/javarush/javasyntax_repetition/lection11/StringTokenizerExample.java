package az.babayev.javarush.javasyntax_repetition.lection11;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String someConfiguration = """
                key=value
                name=Zaur
                surname=Babayev
                email=hidden""";

        StringTokenizer st = new StringTokenizer(someConfiguration);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println("-".repeat(30));
        StringTokenizer st1 = new StringTokenizer(someConfiguration,"=");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        System.out.println("-".repeat(30));
        StringTokenizer st2 = new StringTokenizer(someConfiguration,"=",true);
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

    }
}
