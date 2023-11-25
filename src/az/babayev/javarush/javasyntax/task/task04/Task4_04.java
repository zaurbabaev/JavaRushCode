package az.babayev.javarush.javasyntax.task.task04;

/*
Напиши метод checkSeason. По номеру месяца, метод должен определить время года
(зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна
 */
public class Task4_04 {
    public static void main(String[] args) {
        chechSeason(2);
        chechSeason(4);
        chechSeason(8);
    }

    public static void chechSeason(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("лето");
                break;
            case 9, 10, 11:
                System.out.println("осень");
                break;
        }

    }
}
