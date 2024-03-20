package az.babayev.javarush.javasyntax.repetition;

public class EscapeExample {
    public static void main(String[] args) {
        String s = "Hello my name is \"Zaur\".";
        System.out.println(s);

        System.out.println("\ud83d\udd0a");

        double d = 4.05E-13;
        System.out.println(d);

        String filePath = "D:\\Movies\\Futurama.mp4";
        int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
        String fileName = filePath.substring(lastFileSeparatorIndex + 1);
        System.out.println(fileName);
    }
}
