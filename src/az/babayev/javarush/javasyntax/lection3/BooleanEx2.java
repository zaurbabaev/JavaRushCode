package az.babayev.javarush.javasyntax.lection3;

public class BooleanEx2 {
    public static void main(String[] args) {
        int age = 35;
        boolean isYoung = (age < 18);
        if (!isYoung && age <= 65) {
            System.out.println("Вы можете работать");
        }

    }
}
