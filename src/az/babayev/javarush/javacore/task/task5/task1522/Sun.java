package az.babayev.javarush.javacore.task.task5.task1522;

public class Sun implements Planet{
    private static Sun instance;

    private Sun() {
    }

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
