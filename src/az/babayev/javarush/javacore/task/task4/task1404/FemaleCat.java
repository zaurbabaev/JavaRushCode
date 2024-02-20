package az.babayev.javarush.javacore.task.task4.task1404;

public class FemaleCat extends Cat {
    protected FemaleCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Я - милая  кошечка  но имени " + getName();
    }
}
