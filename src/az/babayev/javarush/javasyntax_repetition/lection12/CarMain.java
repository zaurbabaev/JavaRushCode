package az.babayev.javarush.javasyntax_repetition.lection12;

public class CarMain {
    public static void main(String[] args) {
        MaintenanceService maintenanceService = new MaintenanceService();
        Car car = new Car();
        car.color = "green";
        car.model = "Tesla";
        car.year = 2021;
        maintenanceService.setUpWheels(car);
        System.out.println(car);
    }
}
