package az.babayev.javarush.javacore.task.task4.task1418;

public class HenFactory {
    static Hen getHen(String country) {
        return switch (country) {
            case Country.BELARUS -> new BelarusianHen();
            case Country.UKRAINE -> new UkrainianHen();
            case Country.MOLDOVA -> new MoldovanHen();
            case Country.RUSSIA -> new RussianHen();
            default -> null;
        };
    }
}
