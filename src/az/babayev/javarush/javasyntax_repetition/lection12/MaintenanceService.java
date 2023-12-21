package az.babayev.javarush.javasyntax_repetition.lection12;

public class MaintenanceService {
    public void setUpWheels(Car car) {
        car.wheels = new Wheel[4];

        Wheel wheel1 = new Wheel();
        wheel1.diameter = 15;
        wheel1.position = "front right";
        car.wheels[0] = wheel1;

        Wheel wheel2 = new Wheel();
        wheel2.diameter = 15;
        wheel2.position = "front left";
        car.wheels[1] = wheel2;

        Wheel wheel3 = new Wheel();
        wheel3.diameter = 15;
        wheel3.position = "rear right";
        car.wheels[2] = wheel3;

        Wheel wheel4 = new Wheel();
        wheel4.diameter = 15;
        wheel4.position = "rear left";
        car.wheels[3] = wheel4;

    }
}
