package az.babayev.javarush.javasyntax.lection2;

public class StringEx2 {
    public static void main(String[] args) {
        String name = "Anna " + "Anna";
        System.out.println(name);
        String city = "New York " + "Anna";
        System.out.println(city);
        String message = "Hello! " + "Anna";
        System.out.println(message);

        int x=12;
        System.out.println(city+x);

        System.out.println(name.length());
        System.out.println(city.length());
        System.out.println(message.length());

    }
}
