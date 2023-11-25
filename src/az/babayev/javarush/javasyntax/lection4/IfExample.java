package az.babayev.javarush.javasyntax.lection4;

public class IfExample {
    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            System.out.println("Ты еще ребенок");
            System.out.println("Не спорь со взрослыми");
        } else {
            System.out.println("Вы уже взрослый");
            System.out.println("Ну и молодежь пошла");
        }

        int age1 = 25;
        int money = age1 > 30 ? 100 : 75;
        System.out.println(money);
    }
}
