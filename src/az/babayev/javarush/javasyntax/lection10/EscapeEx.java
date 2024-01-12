package az.babayev.javarush.javasyntax.lection10;

public class EscapeEx {
    public static void main(String[] args) {
        String s = "Фильм \"Друзья\" номинирован на \"Оскар\"";
        System.out.println(s);

        char c1 = '"';
        char c2 = '\"';
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("С уважением,\nАноним");

        System.out.println("0\t10\t20\t30\t40\t");
        System.out.println("0\t1\t2\t3\t4\t");

        System.out.println("c:\\projects\\my\\first");

        System.out.println("\u00A9 JavaRush");

    }
}
