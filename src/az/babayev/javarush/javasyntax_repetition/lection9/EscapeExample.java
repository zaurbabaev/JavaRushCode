package az.babayev.javarush.javasyntax_repetition.lection9;

public class EscapeExample {
    public static void main(String[] args) {
        String str = "Java said,\"Hello World!\"";
        System.out.println(str);
        System.out.println();
        System.out.print("2 + 2 = 5");
        System.out.print("\b");
        System.out.println("4");
        System.out.print("Текст который необходимо переписать.");
        System.out.print('\r');
        System.out.print("New text");
    }
}
