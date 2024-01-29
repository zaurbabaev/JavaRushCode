package az.babayev.javarush.javasyntax.lection16;

public class ExceptionEx {
    public static void main(String[] args) {
        try {
            int i = 5 / 0;
        } catch (ArithmeticException exception) {
            // exceptionu catch blokunda tuturuq və
            // həmin exceptionu yenidən atırıq throw exception
            System.out.println("Перехватили исключение");
            throw exception;
        }
    }
}
