package az.babayev.javarush.javasyntax_repetition.lection12.service;

import az.babayev.javarush.javasyntax_repetition.lection12.models.Car;

public class CarService {

    private static final int DEFAULT_DOOR_COUNT = 5;

    public Car createCar(String color, String model, int year, int doorCount) {
        Car newCar = new Car();
        newCar.color = color;
        newCar.model = model;
        newCar.year = year;
        newCar.doorsCount = doorCount;
        return newCar;
    }

    public Car createCar(String color, String model, int year) {
        Car newCar = new Car();
        newCar.color = color;
        newCar.model = model;
        newCar.year = year;
        newCar.doorsCount = DEFAULT_DOOR_COUNT;
        return newCar;
    }

    public void changeColor(Car car, String newColor) {
        car.color = newColor;
    }


}
