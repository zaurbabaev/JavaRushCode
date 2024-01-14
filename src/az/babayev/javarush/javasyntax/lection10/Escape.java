package az.babayev.javarush.javasyntax.lection10;

public class Escape {
    public static void main(String[] args) {
        String s = "Hello how are you? \"Amigo\"";
        System.out.println(s);
        String s1 = "Hello how are you? \t\"Amigo\"";
        System.out.println(s1);
        String s2 = "Hello how are you? \b\"Amigo\"";
        System.out.println(s2);
        String s3 = "Hello how are you? \n\"Amigo\"";
        System.out.println(s3);
        String s4 = "Hello how are you? \r\"Amigo\"";
        System.out.println(s4);
        String s5 = "Hello how are you? \\\"Amigo\"";
        System.out.println(s5);
        String s6 = "Hello how are you? \'Amigo\'";
        System.out.println(s6);

        System.out.println("\uD83d\uDD0A"); // 🔊


    }
}
