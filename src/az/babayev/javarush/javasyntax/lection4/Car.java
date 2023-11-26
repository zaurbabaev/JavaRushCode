package az.babayev.javarush.javasyntax.lection4;

import javax.xml.transform.Source;
import java.util.Objects;

public class Car {
    String model;
    int maxSpeed;

    public static void main(String[] args) {
        Car car1=new Car();
        car1.model="Ferrari";
        car1.maxSpeed=300;

        Car car2 = new Car();
        car2.model="Ferrari";
        car2.maxSpeed=300;
        System.out.println(car2.equals(car1));


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed);
    }
}
