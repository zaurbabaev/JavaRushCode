package az.babayev.javarush.javasyntax.lection14.linkedList;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
