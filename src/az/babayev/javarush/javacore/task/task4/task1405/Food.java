package az.babayev.javarush.javacore.task.task4.task1405;

public class Food implements Selectable {

    @Override
    public void onSelect() {
        System.out.println("The food was selected");
    }

    public void onEat() {
        System.out.println("The food was eaten");
    }
}
