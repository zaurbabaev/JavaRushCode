package az.babayev.javarush.javasyntax.lection15;

public class ExceptionEx {
    public static void main(String[] args) {

        try {
            int d = 2 / 0;

        } catch (Exception excep) {
            System.out.println("Перехватили исключение");
            throw excep;
        }
    }

}
