package az.babayev.javarush.javacore.task.task4.task1422;

public class Solution {

    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();


        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        if (object instanceof Movable movable) {
            movable.move();
        } else if (object instanceof Drawable drawable) {
            drawable.draw();
        }
    }
}
