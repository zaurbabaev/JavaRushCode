package az.babayev.javarush.javasyntax_repetition.lection12;

import az.babayev.javarush.javasyntax_repetition.lection12.models.Car;
import az.babayev.javarush.javasyntax_repetition.lection12.service.CarService;
import az.babayev.javarush.javasyntax_repetition.lection12.service.MaintenanceService;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        MaintenanceService maintenanceService = new MaintenanceService();

        Car myCar = carService.createCar("white", "Tesla model3", 2019, 7);

        Car coreshCar = carService.createCar("black", "BMW IX", 2022);
        maintenanceService.setupWheels(coreshCar, 4);

        carService.changeColor(myCar, "red");
        maintenanceService.changeDiametr(coreshCar, 19);

        System.out.println(myCar);
        System.out.println(coreshCar);


    }
}
