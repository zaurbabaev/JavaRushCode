package az.babayev.javarush.javacore.task.task4.task14211;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            return instance = new Singleton();
        }
        return instance;
    }
}
