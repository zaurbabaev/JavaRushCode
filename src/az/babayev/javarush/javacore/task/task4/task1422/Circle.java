package az.babayev.javarush.javacore.task.task4.task1422;

public class Circle implements Movable {

    @Override
    public void move() {
        System.out.println("Can be moved");
    }

    public void draw() {
        System.out.println("Can be drawn");
    }
}
