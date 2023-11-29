package az.babayev.javarush.javasyntax.lection7;

public class ArrayDemo4 {
    public static void main(String[] args) {
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < seasons.length; i++) {
            System.out.println("seasons[" + i + "]= " + seasons[i]);
        }
    }
}
