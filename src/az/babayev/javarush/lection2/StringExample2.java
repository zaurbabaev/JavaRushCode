package az.babayev.javarush.lection2;

public class StringExample2 {
    public static void main(String[] args) {
        String name="Zaur";
        var upperCase = name.toUpperCase();
        var lowerCase = name.toLowerCase();
        System.out.println(upperCase);
        System.out.println(lowerCase);
        var length = name.length();
        System.out.println(length);
    }
}
