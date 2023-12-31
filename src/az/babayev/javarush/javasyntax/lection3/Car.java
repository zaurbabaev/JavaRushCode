package az.babayev.javarush.javasyntax.lection3;

import java.util.Objects;

public class Car {
    int maxSpeed;
    String model;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (maxSpeed != car.maxSpeed) return false;
        return Objects.equals(model, car.model);
    }



    public static void main(String[] args) {
        Car car1 = new Car();
        car1.maxSpeed = 300;
        car1.model = "Tesla";
        Car car2 = new Car();
        car2.maxSpeed = 300;
        car2.model = "Tesla";
        System.out.println(car1.equals(car2));
    }
}
