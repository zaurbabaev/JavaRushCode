package az.babayev.javarush.javacore.task.task4.task1418;

public class Solution {
    public static void main(String[] args) {
        Hen belarus = HenFactory.getHen(Country.BELARUS);
        System.out.println(belarus.getCountOfEggsPerMonth());
        System.out.println(belarus.getDescription());
        System.out.println("-".repeat(20));

        Hen russia = HenFactory.getHen(Country.RUSSIA);
        System.out.println(russia.getCountOfEggsPerMonth());
        System.out.println(russia.getDescription());
        System.out.println("-".repeat(20));

        Hen moldova = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(moldova.getCountOfEggsPerMonth());
        System.out.println(moldova.getDescription());
        System.out.println("-".repeat(20));

        Hen ukraine = HenFactory.getHen(Country.UKRAINE);
        System.out.println(ukraine.getCountOfEggsPerMonth());
        System.out.println(ukraine.getDescription());

    }
}
