package az.babayev.javarush.javasyntax_repetition.lection4;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        boolean isValid = true;
        String message = isValid ? "Password is OK" : "Password is not OK";
        System.out.println(message);

        String otherMessage = isValid ? "Password is " + (isValid ? "OK" : "fine")
                : "Password is not " + (isValid ? "OK" : "fine");
        System.out.println(otherMessage);
    }
}
