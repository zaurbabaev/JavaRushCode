package az.babayev.javarush.javacore.task.task4.task1413;

public class Mouse implements CompItem {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
