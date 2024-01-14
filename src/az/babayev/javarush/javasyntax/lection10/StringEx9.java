package az.babayev.javarush.javasyntax.lection10;

public class StringEx9 {
    public static void main(String[] args) {
        String trim = "     ".trim();
        System.out.println(trim);
        String trim1 = "Привет".trim();
        System.out.println(trim1);
        System.out.println("-".repeat(20));
        String trim2 = " Привет\n как дела?\n   ".trim();
        System.out.println(trim2);

        String trim3 = "  Пароль\n   \n ".trim();
        System.out.println(trim3);

    }
}
