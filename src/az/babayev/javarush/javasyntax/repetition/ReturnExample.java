package az.babayev.javarush.javasyntax.repetition;

public class ReturnExample {
    public static void main(String[] args) {
        System.out.println(dayTime(7));
        System.out.println(dayTime(13));
        System.out.println(dayTime(18));
        System.out.println(dayTime(2));
    }

    public static String dayTime(int hour) {
        if (hour > 24 || hour < 0) {
            return "Invalid data";
        } else if (hour > 21 || hour < 6) {
            return "Good night";
        } else if (hour >= 15) {
            return "Good evening";
        } else if (hour >= 11) {
            return "Good afternoon";
        } else
            return "Good morning";
    }
}
