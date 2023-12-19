package az.babayev.javarush.javasyntax_repetition.lection9;

public class StringEqualsExample {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "Hello World!";
        System.out.println("s.equals()s1 = " + s.equals(s1));
        System.out.println("s.equalsIgnoreCase()s1 = " + s.equalsIgnoreCase(s1));
        System.out.println("s.compareTo(s1) = " + s.compareTo(s1));
        System.out.println("s.compareToIgnoreCase(s1) = " + s.compareToIgnoreCase(s1));
        System.out.println("s.contains(\"World\") = " + s.contains("World"));
        System.out.println("s.endWith(\"World\") = " + s.endsWith("World"));
        System.out.println("s.startWith(\"Hello\") = " + s.startsWith("Hello"));
        System.out.println("s.regionMatches(true, 0, s1, 0, 5) = "
                + s.regionMatches(true, 0, s1, 0, 5));




    }
}
