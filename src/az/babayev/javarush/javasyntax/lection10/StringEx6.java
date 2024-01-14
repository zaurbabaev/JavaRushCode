package az.babayev.javarush.javasyntax.lection10;

public class StringEx6 {
    public static void main(String[] args) {
        String substring1 = "Привет".substring(0, 3); // При
        System.out.println(substring1);
        String substring2 = "Привет".substring(1, 4); //рив
        System.out.println(substring2);
        String substring3 = "Привет".substring(1, 6); //ривет
        System.out.println(substring3);
        String substring4 = "Привет".substring(1); //ривет
        System.out.println(substring4);
    }
}
