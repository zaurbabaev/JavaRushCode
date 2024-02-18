package az.babayev.javarush.javacore.task.task3.task1305;

public class Hobby implements Dream, Desire {
    static int INDEX = 1;

    @Override
    public String toString() {
        INDEX++;
        return "" + INDEX;
    }
}
