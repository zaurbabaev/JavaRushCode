package az.babayev.javarush.javasyntax.task.task18.interfaceex.task1716;

public class Solution {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.move();
        car.stop();

        Vehicle bus = new Bus();
        bus.start();
        bus.move();
        bus.stop();
    }
}
