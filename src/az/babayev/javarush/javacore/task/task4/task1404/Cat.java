package az.babayev.javarush.javacore.task.task4.task1404;

public class Cat {
    private String name;

    protected Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Я уличный кот " + getName();
    }

}
