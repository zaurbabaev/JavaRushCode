package az.babayev.javarush.javasyntax_repetition.lection9;

public class StringSubstringMethodsExample {
    public static void main(String[] args) {
        String s = "String and String methods are very useful in Java";
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(6,11));
        System.out.println(s.substring(12,17));

        System.out.println(s.replace("String", "StringBuilder"));
        System.out.println(s.replaceFirst("String","StringBuilder"));
        System.out.println(s.replaceAll("String","StringBuilder"));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
    }
}
