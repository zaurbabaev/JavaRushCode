package az.babayev.javarush.javacore.task.task4.task1404;

public class CatFactory {

    public static Cat getCatByKey(String key) {
        return switch (key) {
            case "vaska" -> new MaleCat("Василий");
            case "murka" -> new FemaleCat("Мурочка");
            case "kiska" -> new FemaleCat("Кисюлька");
            default -> new Cat(key);
        };
    }
}
