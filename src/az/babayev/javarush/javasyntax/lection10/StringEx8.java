package az.babayev.javarush.javasyntax.lection10;

public class StringEx8 {
    public static void main(String[] args) {
        String replace1 = "Good news everyone!".replaceAll("e.", "Ex");
        System.out.println(replace1);

        String replace2 = "Good news everyone!".replaceAll("o.", "-o-");
        System.out.println(replace2);

        String replace3 = "Good news everyone!".replaceFirst("e.", "Ex");
        System.out.println(replace3);

        String replace4 = "Good news everyone!".replaceFirst("o.", "-o-");
        System.out.println(replace4);




    }
}
