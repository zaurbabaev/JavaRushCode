package az.babayev.javarush.javasyntax.lection16;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception exception) {
            System.out.println("Перехватили исключение");
            throw exception;
        }
    }
}
