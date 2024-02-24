package az.babayev.javarush.javacore.task.task5.task1522;

public class Earth implements Planet{
    private static Earth instance;

    private Earth() {

    }

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
