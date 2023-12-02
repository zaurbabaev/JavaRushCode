package az.babayev.javarush.javasyntax.lection10;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello Amigo!";
        int length = s.length();
        System.out.println("Lenght " + length);
        boolean empty = s.isEmpty();
        System.out.println("IsEmpty " + empty);
        boolean blank = s.isBlank();
        System.out.println("IsBlank " + blank);
        char charAt = s.charAt(4);
        System.out.println("CharAt " + charAt);
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            System.out.print(c + "\t");
        }
        System.out.println();

        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte + " ");
        }
        System.out.println();

        String[] s1 = s.split(" ");
        for (String string : s1) {
            System.out.println(string + " ");
        }

        String join = String.join(",", "hello", "poka");
        System.out.println(join);
    }
}
