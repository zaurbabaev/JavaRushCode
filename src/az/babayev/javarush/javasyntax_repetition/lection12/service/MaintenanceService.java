package az.babayev.javarush.javasyntax_repetition.lection12.service;

import az.babayev.javarush.javasyntax_repetition.lection12.models.Car;
import az.babayev.javarush.javasyntax_repetition.lection12.models.Wheel;

public class MaintenanceService {
    public void setupWheels(Car car, int wheelDiametr) {
        car.wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            Wheel wheel = new Wheel();
            wheel.diametr = wheelDiametr;
            wheel.position = "Good position";
            car.wheels[i] = wheel;
        }
    }

    public void changeDiametr(Car car, int newDiametr) {
        for (int i = 0; i < 4; i++) {
            car.wheels[i].diametr = newDiametr;
        }
    }
}
