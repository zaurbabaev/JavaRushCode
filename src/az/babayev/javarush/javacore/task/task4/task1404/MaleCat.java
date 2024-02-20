package az.babayev.javarush.javacore.task.task4.task1404;

public class MaleCat extends Cat {

    protected MaleCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Я - солидный кошак но имени " + getName();
    }
}
