package az.babayev.javarush.javasyntax.task.task18.interfaceex.task1716;

public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("Еду со средней скоростью 70 км/ч.");
    }
}
