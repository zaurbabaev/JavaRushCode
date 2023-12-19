package az.babayev.javarush.javasyntax_repetition.lection9;

public class StringSearchMethodsExample {
    public static void main(String[] args) {
        String s = "String and String methods";
        System.out.println(s.indexOf(1));
        System.out.println(s.indexOf("and"));
        System.out.println(s.indexOf("String", 5));
        System.out.println(s.lastIndexOf(83));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.matches("String."));
        System.out.println(s.matches("String.methods"));

    }
}
